package br.com.tamadrum.itrainer.modelo;

import java.util.Calendar;
import java.util.List;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBModel;

/**
 * Created by ettoreluglio on 07/07/17.
 */

public class Treino implements FirebaseRTDBModel {

    private Long id;
    private String hash;
    private String usuario;
    private long dataInicial;
    private long dataFinal;
    private String personal;
    private String academia;
    private String confirmado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(long dataInicial) {
        this.dataInicial = dataInicial;
    }

    public long getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(long dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public void setConfirmado(String confirmado) {
        this.confirmado = confirmado;
    }

    public String getConfirmado() {
        return confirmado;
    }
}
