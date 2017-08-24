package br.com.tamadrum.itrainer.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBModel;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBToken;

/**
 * Created by ettoreluglio on 07/07/17.
 */

public class Personal implements FirebaseRTDBModel {

    private String hash;
    private List<String> especialidades;
    private double classificacao;
    private String crefi;
    private String miniCurriculum;
    private List<String> regioes;

    @Override
    public String getHash() {
        return hash;
    }

    @Override
    public void setHash(String hash) {
        this.hash = hash;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public String getCrefi() {
        return crefi;
    }

    public void setCrefi(String crefi) {
        this.crefi = crefi;
    }

    public String getMiniCurriculum() {
        return miniCurriculum;
    }

    public void setMiniCurriculum(String miniCurriculum) {
        this.miniCurriculum = miniCurriculum;
    }

    public List<String> getRegioes() {
        return regioes;
    }

    public void setRegioes(List<String> regioes) {
        this.regioes = regioes;
    }
}
