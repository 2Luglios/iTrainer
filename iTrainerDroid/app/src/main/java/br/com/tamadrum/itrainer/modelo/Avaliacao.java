package br.com.tamadrum.itrainer.modelo;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBModel;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class Avaliacao implements FirebaseRTDBModel {

    private Long id;
    private String hash;
    private long data;

    private double peso;
    private double altura;
    private double fcRepouso;
    private double paRepouso;

    private double perimetroTorax;
    private double perimetroCintura;
    private double perimetroAbdome;
    private double perimetroQuadril;
    private double perimetroPanturrilhaEsquerda;
    private double perimetroPanturrilhaDireita;
    private double perimetroCoxaEsquerda;
    private double perimetroCoxaDireita;
    private double perimetroBracoEsquerdo;
    private double perimetroBracoDireito;
    private double perimetroAntebracoEsquerdo;
    private double perimetroAntebracoDireito;

    private double dobraSubscapular;
    private double dobraCoxa;
    private double dobraTricipal;
    private double dobraPeitoral;
    private double dobraAxiliarMedia;
    private double dobraSupraIliaca;
    private double dobraAbdominal;

    private double cardiorespiratorioCarga1;
    private double cardiorespiratorioCarga1FC2Min;
    private double cardiorespiratorioCarga1FC4Min;
    private double cardiorespiratorioCarga1PA2Min;
    private double cardiorespiratorioCarga1PA4Min;
    private double cardiorespiratorioCarga2;
    private double cardiorespiratorioCarga2FC2Min;
    private double cardiorespiratorioCarga2FC4Min;
    private double cardiorespiratorioCarga2PA2Min;
    private double cardiorespiratorioCarga2PA4Min;
    private double cardiorespiratorioVO2Maximo;
    private String classificacao;

    private int resistenciaFlexao;
    private String resistenciaFlexaoClassificacao;
    private int resistenciaAbdominal;
    private String resistenciaAbdominalClassificacao;

    private String avaliador;
    private String cref;

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

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getFcRepouso() {
        return fcRepouso;
    }

    public void setFcRepouso(double fcRepouso) {
        this.fcRepouso = fcRepouso;
    }

    public double getPaRepouso() {
        return paRepouso;
    }

    public void setPaRepouso(double paRepouso) {
        this.paRepouso = paRepouso;
    }

    public double getPerimetroTorax() {
        return perimetroTorax;
    }

    public void setPerimetroTorax(double perimetroTorax) {
        this.perimetroTorax = perimetroTorax;
    }

    public double getPerimetroCintura() {
        return perimetroCintura;
    }

    public void setPerimetroCintura(double perimetroCintura) {
        this.perimetroCintura = perimetroCintura;
    }

    public double getPerimetroAbdome() {
        return perimetroAbdome;
    }

    public void setPerimetroAbdome(double perimetroAbdome) {
        this.perimetroAbdome = perimetroAbdome;
    }

    public double getPerimetroQuadril() {
        return perimetroQuadril;
    }

    public void setPerimetroQuadril(double perimetroQuadril) {
        this.perimetroQuadril = perimetroQuadril;
    }

    public double getPerimetroPanturrilhaEsquerda() {
        return perimetroPanturrilhaEsquerda;
    }

    public void setPerimetroPanturrilhaEsquerda(double perimetroPanturrilhaEsquerda) {
        this.perimetroPanturrilhaEsquerda = perimetroPanturrilhaEsquerda;
    }

    public double getPerimetroPanturrilhaDireita() {
        return perimetroPanturrilhaDireita;
    }

    public void setPerimetroPanturrilhaDireita(double perimetroPanturrilhaDireita) {
        this.perimetroPanturrilhaDireita = perimetroPanturrilhaDireita;
    }

    public double getPerimetroCoxaEsquerda() {
        return perimetroCoxaEsquerda;
    }

    public void setPerimetroCoxaEsquerda(double perimetroCoxaEsquerda) {
        this.perimetroCoxaEsquerda = perimetroCoxaEsquerda;
    }

    public double getPerimetroCoxaDireita() {
        return perimetroCoxaDireita;
    }

    public void setPerimetroCoxaDireita(double perimetroCoxaDireita) {
        this.perimetroCoxaDireita = perimetroCoxaDireita;
    }

    public double getPerimetroBracoEsquerdo() {
        return perimetroBracoEsquerdo;
    }

    public void setPerimetroBracoEsquerdo(double perimetroBracoEsquerdo) {
        this.perimetroBracoEsquerdo = perimetroBracoEsquerdo;
    }

    public double getPerimetroBracoDireito() {
        return perimetroBracoDireito;
    }

    public void setPerimetroBracoDireito(double perimetroBracoDireito) {
        this.perimetroBracoDireito = perimetroBracoDireito;
    }

    public double getPerimetroAntebracoEsquerdo() {
        return perimetroAntebracoEsquerdo;
    }

    public void setPerimetroAntebracoEsquerdo(double perimetroAntebracoEsquerdo) {
        this.perimetroAntebracoEsquerdo = perimetroAntebracoEsquerdo;
    }

    public double getPerimetroAntebracoDireito() {
        return perimetroAntebracoDireito;
    }

    public void setPerimetroAntebracoDireito(double perimetroAntebracoDireito) {
        this.perimetroAntebracoDireito = perimetroAntebracoDireito;
    }

    public double getDobraSubscapular() {
        return dobraSubscapular;
    }

    public void setDobraSubscapular(double dobraSubscapular) {
        this.dobraSubscapular = dobraSubscapular;
    }

    public double getDobraCoxa() {
        return dobraCoxa;
    }

    public void setDobraCoxa(double dobraCoxa) {
        this.dobraCoxa = dobraCoxa;
    }

    public double getDobraTricipal() {
        return dobraTricipal;
    }

    public void setDobraTricipal(double dobraTricipal) {
        this.dobraTricipal = dobraTricipal;
    }

    public double getDobraPeitoral() {
        return dobraPeitoral;
    }

    public void setDobraPeitoral(double dobraPeitoral) {
        this.dobraPeitoral = dobraPeitoral;
    }

    public double getDobraAxiliarMedia() {
        return dobraAxiliarMedia;
    }

    public void setDobraAxiliarMedia(double dobraAxiliarMedia) {
        this.dobraAxiliarMedia = dobraAxiliarMedia;
    }

    public double getDobraSupraIliaca() {
        return dobraSupraIliaca;
    }

    public void setDobraSupraIliaca(double dobraSupraIliaca) {
        this.dobraSupraIliaca = dobraSupraIliaca;
    }

    public double getDobraAbdominal() {
        return dobraAbdominal;
    }

    public void setDobraAbdominal(double dobraAbdominal) {
        this.dobraAbdominal = dobraAbdominal;
    }

    public double getCardiorespiratorioCarga1() {
        return cardiorespiratorioCarga1;
    }

    public void setCardiorespiratorioCarga1(double cardiorespiratorioCarga1) {
        this.cardiorespiratorioCarga1 = cardiorespiratorioCarga1;
    }

    public double getCardiorespiratorioCarga1FC2Min() {
        return cardiorespiratorioCarga1FC2Min;
    }

    public void setCardiorespiratorioCarga1FC2Min(double cardiorespiratorioCarga1FC2Min) {
        this.cardiorespiratorioCarga1FC2Min = cardiorespiratorioCarga1FC2Min;
    }

    public double getCardiorespiratorioCarga1FC4Min() {
        return cardiorespiratorioCarga1FC4Min;
    }

    public void setCardiorespiratorioCarga1FC4Min(double cardiorespiratorioCarga1FC4Min) {
        this.cardiorespiratorioCarga1FC4Min = cardiorespiratorioCarga1FC4Min;
    }

    public double getCardiorespiratorioCarga1PA2Min() {
        return cardiorespiratorioCarga1PA2Min;
    }

    public void setCardiorespiratorioCarga1PA2Min(double cardiorespiratorioCarga1PA2Min) {
        this.cardiorespiratorioCarga1PA2Min = cardiorespiratorioCarga1PA2Min;
    }

    public double getCardiorespiratorioCarga1PA4Min() {
        return cardiorespiratorioCarga1PA4Min;
    }

    public void setCardiorespiratorioCarga1PA4Min(double cardiorespiratorioCarga1PA4Min) {
        this.cardiorespiratorioCarga1PA4Min = cardiorespiratorioCarga1PA4Min;
    }

    public double getCardiorespiratorioCarga2() {
        return cardiorespiratorioCarga2;
    }

    public void setCardiorespiratorioCarga2(double cardiorespiratorioCarga2) {
        this.cardiorespiratorioCarga2 = cardiorespiratorioCarga2;
    }

    public double getCardiorespiratorioCarga2FC2Min() {
        return cardiorespiratorioCarga2FC2Min;
    }

    public void setCardiorespiratorioCarga2FC2Min(double cardiorespiratorioCarga2FC2Min) {
        this.cardiorespiratorioCarga2FC2Min = cardiorespiratorioCarga2FC2Min;
    }

    public double getCardiorespiratorioCarga2FC4Min() {
        return cardiorespiratorioCarga2FC4Min;
    }

    public void setCardiorespiratorioCarga2FC4Min(double cardiorespiratorioCarga2FC4Min) {
        this.cardiorespiratorioCarga2FC4Min = cardiorespiratorioCarga2FC4Min;
    }

    public double getCardiorespiratorioCarga2PA2Min() {
        return cardiorespiratorioCarga2PA2Min;
    }

    public void setCardiorespiratorioCarga2PA2Min(double cardiorespiratorioCarga2PA2Min) {
        this.cardiorespiratorioCarga2PA2Min = cardiorespiratorioCarga2PA2Min;
    }

    public double getCardiorespiratorioCarga2PA4Min() {
        return cardiorespiratorioCarga2PA4Min;
    }

    public void setCardiorespiratorioCarga2PA4Min(double cardiorespiratorioCarga2PA4Min) {
        this.cardiorespiratorioCarga2PA4Min = cardiorespiratorioCarga2PA4Min;
    }

    public double getCardiorespiratorioVO2Maximo() {
        return cardiorespiratorioVO2Maximo;
    }

    public void setCardiorespiratorioVO2Maximo(double cardiorespiratorioVO2Maximo) {
        this.cardiorespiratorioVO2Maximo = cardiorespiratorioVO2Maximo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getResistenciaFlexao() {
        return resistenciaFlexao;
    }

    public void setResistenciaFlexao(int resistenciaFlexao) {
        this.resistenciaFlexao = resistenciaFlexao;
    }

    public String getResistenciaFlexaoClassificacao() {
        return resistenciaFlexaoClassificacao;
    }

    public void setResistenciaFlexaoClassificacao(String resistenciaFlexaoClassificacao) {
        this.resistenciaFlexaoClassificacao = resistenciaFlexaoClassificacao;
    }

    public int getResistenciaAbdominal() {
        return resistenciaAbdominal;
    }

    public void setResistenciaAbdominal(int resistenciaAbdominal) {
        this.resistenciaAbdominal = resistenciaAbdominal;
    }

    public String getResistenciaAbdominalClassificacao() {
        return resistenciaAbdominalClassificacao;
    }

    public void setResistenciaAbdominalClassificacao(String resistenciaAbdominalClassificacao) {
        this.resistenciaAbdominalClassificacao = resistenciaAbdominalClassificacao;
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }
}
