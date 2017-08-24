package br.com.tamadrum.itrainer.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBInterface;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBModel;

/**
 * Created by ettoreluglio on 07/07/17.
 */

public class Academia implements FirebaseRTDBModel{

    private Long id;
    private String hash;
    private String nome;
    private Map<String, String> contato = new HashMap<>();
    private Map<String, String> endereco = new HashMap<>();
    private List<String> salas;
    private List<String> aparelhos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getHash() {
        return hash;
    }

    @Override
    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, String> getContato() {
        return contato;
    }

    public void setContato(Map<String, String> contato) {
        this.contato = contato;
    }

    public Map<String, String> getEndereco() {
        return endereco;
    }

    public void setEndereco(Map<String, String> endereco) {
        this.endereco = endereco;
    }

    public List<String> getSalas() {
        return salas;
    }

    public void setSalas(List<String> salas) {
        this.salas = salas;
    }

    public List<String> getAparelhos() {
        return aparelhos;
    }

    public void setAparelhos(List<String> aparelhos) {
        this.aparelhos = aparelhos;
    }
}
