package br.com.tamadrum.itrainer.modelo;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBModel;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class Plano implements FirebaseRTDBModel {

    private Long id;
    private String hash;
    private String nome;
    private int aulas;
    private double valorTotal;
    private double valorPorAula;

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

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorPorAula() {
        return valorPorAula;
    }

    public void setValorPorAula(double valorPorAula) {
        this.valorPorAula = valorPorAula;
    }
}
