package br.com.tamadrum.itrainer.firebase;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class FirebaseStorageUtil {

    //        FirebaseStorage storage = FirebaseStorage.getInstance("gs://itrainer-2c9c2.appspot.com");
//
//        StorageReference storageRef = storage.getReference().child("images/ettore-luglio-120.1394081564.jpg");
//
//        final long ONE_MEGABYTE = 1024 * 1024;
//        storageRef.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
//            @Override
//            public void onSuccess(byte[] bytes) {
//                Log.d("lalala", "" + bytes.length);
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                Log.d("lalala", "Error reading img" + exception.getMessage());
//            }
//        });

//        byte[] b = new byte[100];
//
//        UploadTask uploadTask = storage.getReference().child("images/b.txt").putBytes(b);
//        uploadTask.addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                // Handle unsuccessful uploads
//            }
//        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//            @Override
//            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                // taskSnapshot.getMetadata() contains file metadata such as size, content-type, and download URL.
//                Uri downloadUrl = taskSnapshot.getDownloadUrl();
//            }
//        });

}
