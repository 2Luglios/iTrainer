// ********************************
// * Data: 22/07/2017
// * Inicialização
// ********************************

const functions = require('firebase-functions');
var firebase = require('firebase');
var request = require('request');

var serviceAccount = require("./iTrainer-6b0aa509a766.json");
var API_KEY = "AAAAfDqXPpA:APA91bHOY59YABstQM_1EIeirarduoUC5MEElgJIhNy-SjVOwUwuDvT-Yet0cmsYiQusZCEzzIEinz_u0Ru3tj4mRYC3xhirqMXDtyhaz4O37wu7xbuNPSQOsdEfGOiEGI_17zkC5wjC";

firebase.initializeApp({
  appName: "iTrainer",
  credential: "./google-services.json",
  databaseURL: "https://itrainer-2c9c2.firebaseio.com/"
});

var ref = firebase.app().database();

// ********************************
// * Data: 22/07/2017
// * Mensagens
// ********************************

exports.sendMSG = functions.https.onRequest((req, res) => {
  if (req.query.user === undefined) {
    res.status(400).send('No user defined!');
  } else {
    const user = req.query.user;
    const msg = req.query.msg;
    const origin = req.query.origin;

    sendMessageToTopic(user, msg, function() {
      var mensagensRef = ref.ref('mensagens');
      mensagensRef.push({ 
        data: new Date().getTime(),
        origem: origin,
        destino: user,
        mensagem: msg 
      }, function(error) {
        if (error) console.log('ooops');
      });
      res.status(200).send('Adicionando Mensagem');
    });
  }
});

exports.mensagemList = functions.https.onRequest((req, res) => {
  var ref = firebase.app().database().ref('mensagens');
  ref.once('value').then(function (snap) {
    res.status(200).send(snap.val());
  });
});

function sendMessageToTopic(username, message, onSuccess) {
  request({
    url: 'https://fcm.googleapis.com/fcm/send',
    method: 'POST',
    headers: {
      'Content-Type' :' application/json',
      'Authorization': 'key='+API_KEY
    },
    body: JSON.stringify({
      notification: {
        title: "MSGWEB",
        click_action: ".SplashActivity",
        body: message,
        icon: "ic_notif_symulti"
      },
      to : '/topics/user_personal_'+username
    })
  }, function(error, response, body) {
    if (error) { console.error(error); }
    else if (response.statusCode >= 400) { 
      console.error('HTTP Error: '+response.statusCode+' - '+response.statusMessage); 
    }
    else {
      onSuccess();
    }
  });
}

function sendMessageToDevice(origem, destino, mensagem) {
    request({
        url: 'https://fcm.googleapis.com/fcm/send',
        method: 'POST',
        headers: {
            'Content-Type' :' application/json',
            'Authorization': 'key='+API_KEY
        },
        body: JSON.stringify({
            data: { 
                body: mensagem,
                title: 'mensagem',
                priority: 10
            },
            to: destino
        })
    }, function(error, response, body) {
        if (error) { console.log(error); }
        else if (response.statusCode >= 400) {
            console.error('HTTP Error: '+response.statusCode+' - '+response.statusMessage); 
        } else {
            onSuccess();
        }
    });
}

// // ********************************
// // * Data: 22/07/2017
// // * Academias
// // ********************************

// exports.academiaAdd = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         var academiasRef = ref.child('academias');
//         var academiaRef = academiaRef.push({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         });
//         res.status(200).send('Adicionando Academia');
//     }
// });

// exports.academiaList = functions.https.onRequest((req, res) => {
//     var ref = firebase.app().database().ref('academias');
//     ref.once('value').then(function (snap) {
//         res.status(200).send(snap.val());
//     });
//     res.status(200).send('Listando Academias');
// });

// exports.academiaRemove = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;
    
//         firebase.database().ref('mensagem/' + id).remove();
//         res.status(200).send('Apagando Academia ' + id);
//     }
// });

// exports.academiaUpdate = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;

//         var academiaRef = ref.child('academias/' + id);
//         academiaRef.update({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         }).catch(function (err) {
//             console.log('one of these updates failed', err);
//         });
//         res.status(200).send('Atualizando Academia ' + id);
//     }
// });

// // ********************************
// // * Data: 22/07/2017
// // * Personais
// // ********************************

// exports.personalAdd = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         var personaisRef = ref.child('personal');
//         var personalRef = personaisRef.push({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         });
//         res.status(200).send('Adicionando Personal');
//     }
// });

// exports.personalList = functions.https.onRequest((req, res) => {
//     var ref = firebase.app().database().ref('personais');
//     ref.once('value').then(function (snap) {
//         res.status(200).send(snap.val());
//     });
//     res.status(200).send('Listando Personais');
// });

// exports.personalRemove = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;
    
//         firebase.database().ref('personal/' + id).remove();
//         res.status(200).send('Apagando Personal ' + id);
//     }
// });

// exports.personalUpdate = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;

//         var academiaRef = ref.child('personais/' + id);
//         academiaRef.update({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         }).catch(function (err) {
//             console.log('one of these updates failed', err);
//         });
//         res.status(200).send('Atualizando Personal ' + id);
//     }
// });

// // ********************************
// // * Data: 22/07/2017
// // * Treinos
// // ********************************

// exports.treinoAdd = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         var personaisRef = ref.child('treinos');
//         var personalRef = personaisRef.push({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         });
//         res.status(200).send('Adicionando Treinos');
//     }
// });

// exports.treinoList = functions.https.onRequest((req, res) => {
//     var ref = firebase.app().database().ref('treinos');
//     ref.once('value').then(function (snap) {
//         res.status(200).send(snap.val());
//     });
//     res.status(200).send('Listando Treinos');
// });

// exports.treinoRemove = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;
    
//         firebase.database().ref('treinos/' + id).remove();
//         res.status(200).send('Apagando Treino ' + id);
//     }
// });

// exports.treinoUpdate = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;

//         var academiaRef = ref.child('treinos/' + id);
//         academiaRef.update({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         }).catch(function (err) {
//             console.log('one of these updates failed', err);
//         });
//         res.status(200).send('Atualizando Treino ' + id);
//     }
// });

// // ********************************
// // * Data: 22/07/2017
// // * Usuarios
// // ********************************

// exports.usuarioAdd = functions.https.onRequest((req, res) => {
//   if (req.query.user === undefined) {
//     // This is an error case, as "message" is required
//     res.status(400).send('No user defined!');
//   } else {
//     const user = req.query.user;
//     const msg = req.query.msg;

//     var id = new Date().getTime();

//     firebase.database().ref('usuarios/' + id).set({
//       firebaseCode:',jbvkdabvlkjabfv;kdsbfv',
//       nascimento:'23/12/1981',
//       nome:'Ettore Luglio',
//       senha:'amor',
//       treinos:'',
//       avaliacoes:''
//     });

//     firebase.database().ref('usuarios/' + id + '/treinos/' + id).set({
//       data:'10/10/2010',
//       nome:'Perna',
//       peso:20,
//       repeticao:5,
//       vezes:12
//     });

//     firebase.database().ref('usuarios/' + id + '/avaliacoes/' + id).set({
//       altura:178,
//       data:'10/10/2010',
//       idade:36,
//       motivo:'pq eu quis',
//       peso:98
//     });

//     res.status(200).end();
//   }
// });

// exports.usuarioList = functions.https.onRequest((req, res) => {
//     var ref = firebase.app().database().ref('usuarios');
//     ref.once('value').then(function (snap) {
//         res.status(200).send(snap.val());
//     });
//     res.status(200).send('Listando Usuarios');
// });

// exports.usuarioRemove = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;
    
//         firebase.database().ref('usuario/' + id).remove();
//         res.status(200).send('Apagando Usuario ' + id);
//     }
// });

// exports.usuarioUpdate = functions.https.onRequest((req, res) => {
//     if (req.query.user === undefined) {
//         res.status(400).send('No user defined!');
//     } else {
//         const id = req.query.id;

//         var academiaRef = ref.child('usuarios/' + id);
//         academiaRef.update({
//             name: req.query.nome,
//             telefone: req.query.telefone,
//             endereco: req.query.endereco
//         }).catch(function (err) {
//             console.log('one of these updates failed', err);
//         });
//         res.status(200).send('Atualizando Usuario ' + id);
//     }
// });
