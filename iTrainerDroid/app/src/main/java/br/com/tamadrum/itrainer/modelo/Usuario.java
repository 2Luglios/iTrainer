package br.com.tamadrum.itrainer.modelo;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import br.com.tamadrum.itrainer.firebase.FirebaseRTDBModel;
import br.com.tamadrum.itrainer.firebase.FirebaseRTDBToken;

/**
 * Created by ettoreluglio on 07/07/17.
 */

public class Usuario implements FirebaseRTDBModel, FirebaseRTDBToken {

    private Long id;
    private String hash;
    private String nome;
    private String sexo;
    private String nascimento;
    private String naturalidade;
    private String nacionalidade;
    private String profissao;
    private String rg;
    private String cpf;
    private String token;
    private String email;
    private String senha;
    private String lembrete;
    private long dataCadastro;
    private String plano;
    private boolean autoRenovacao;
    private int aulasRestantes;
    private int minutosAntesLembrete;
    private Map<String, Object> contato = new HashMap<>();
    private Map<String, Object> endereco = new HashMap<>();
    private Map<String, Object> anamnese = new HashMap<>();

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLembrete() {
        return lembrete;
    }

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public long getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(long dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public boolean isAutoRenovacao() {
        return autoRenovacao;
    }

    public void setAutoRenovacao(boolean autoRenovacao) {
        this.autoRenovacao = autoRenovacao;
    }

    public int getAulasRestantes() {
        return aulasRestantes;
    }

    public void setAulasRestantes(int aulasRestantes) {
        this.aulasRestantes = aulasRestantes;
    }

    public int getMinutosAntesLembrete() {
        return minutosAntesLembrete;
    }

    public void setMinutosAntesLembrete(int minutosAntesLembrete) {
        this.minutosAntesLembrete = minutosAntesLembrete;
    }

    public Map<String, Object> getContato() {
        return contato;
    }

    public void setContato(Map<String, Object> contato) {
        this.contato = contato;
    }

    public Map<String, Object> getEndereco() {
        return endereco;
    }

    public void setEndereco(Map<String, Object> endereco) {
        this.endereco = endereco;
    }

    public Map<String, Object> getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Map<String, Object> anamnese) {
        this.anamnese = anamnese;
    }
}
