package br.com.tamadrum.itrainer.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class MapAnamnese implements MapaFirebase {

    private long dataPreenchimento;
    private double peso;
    private double altura;
    private double fcRepouso;
    private boolean gravidez;
    private int qtdRefeicoesPorDia;
    private String dietaOuSuplementacao;
    private int qtdHorasDormidasPorNoite;
    private int horasTrabalhadasPorSemana;
    private String atividadeDesempenhadaNoTrabalho; //SentarNaCadeira, Caminhar, LevantarOuCarregarPesos, Dirigir, FicarDePe, Outros
    private String obs;

    private String dataUltimoExameFisico;
    private String cardiopatiaAntesDos50; //Pai, Mae, IrmaoIrma, AvoAvo
    private String intervencaoCirurgica; // Coluna, Rim, Pulmao, Coracao, Articulacao, Olhos, HerniaDeDisco, Outra
    private String problemasDiagnosticadosETratados; // Reumatismo, Epilepsia, Alcoolismo, Artrite, Cardiopatia, Diabetes, ProblemasMusculares, ProblemaRenal, ProblemaOcular, PressaoArterialAlta, Efisema, Ulcera, AVC, Anemia, Asma, Obesidade, Outros
    private String medicamentosUtilizados;

    private String tosseComSangue;  // sempre   algumasVezes    nunca
    private String dorAbdominal;  // sempre   algumasVezes    nunca
    private String dorNasPernas;  // sempre   algumasVezes    nunca
    private String dorNosBracos;  // sempre   algumasVezes    nunca
    private String dorNasCostasOuPescoco;  // sempre   algumasVezes    nunca
    private String dorNoPeito;  // sempre   algumasVezes    nunca
    private String doresArticulares;  // sempre   algumasVezes    nunca
    private String faltaDeArComEsforcoLeve;  // sempre   algumasVezes    nunca
    private String sentirFraqueza;  // sempre   algumasVezes    nunca
    private String tontura;  // sempre   algumasVezes    nunca
    private String palpitacaoOuBatimentoCardiacoAcelerado;  // sempre   algumasVezes    nunca
    private String alergia; // sim nao quais
    private String lesaoOsteoArticular; // sim nao quais
    private String restricaoAtividadeFisica; // sim nao quais

    private String fuma; // sim nao quantospordia
    private String bebe; // sim nao quantasporsemana
    private boolean colesterol;
    private double valorColesterol;
    private boolean triglicerides;
    private boolean glicodeAlta;
    private boolean hipertensao;
    private boolean diabetico;
    private boolean parenteDiabetico;
    private boolean problemasPulmonares;
    private boolean foiCriancaObesaOuSobrepeso;
    private boolean temPaisObesosOuSobrepeso;
    private String fazAtividadeFisica; // Sim nao quais frequencia duracao
    private String objetivos; // Estética, Lazer, ConvivioSocial, Emagrecimento, Terapeutico, CondicionamentoFisico, Outros
    private String comentariosGerais;

    public long getDataPreenchimento() {
        return dataPreenchimento;
    }

    public void setDataPreenchimento(long dataPreenchimento) {
        this.dataPreenchimento = dataPreenchimento;
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

    public boolean isGravidez() {
        return gravidez;
    }

    public void setGravidez(boolean gravidez) {
        this.gravidez = gravidez;
    }

    public int getQtdRefeicoesPorDia() {
        return qtdRefeicoesPorDia;
    }

    public void setQtdRefeicoesPorDia(int qtdRefeicoesPorDia) {
        this.qtdRefeicoesPorDia = qtdRefeicoesPorDia;
    }

    public String getDietaOuSuplementacao() {
        return dietaOuSuplementacao;
    }

    public void setDietaOuSuplementacao(String dietaOuSuplementacao) {
        this.dietaOuSuplementacao = dietaOuSuplementacao;
    }

    public int getQtdHorasDormidasPorNoite() {
        return qtdHorasDormidasPorNoite;
    }

    public void setQtdHorasDormidasPorNoite(int qtdHorasDormidasPorNoite) {
        this.qtdHorasDormidasPorNoite = qtdHorasDormidasPorNoite;
    }

    public int getHorasTrabalhadasPorSemana() {
        return horasTrabalhadasPorSemana;
    }

    public void setHorasTrabalhadasPorSemana(int horasTrabalhadasPorSemana) {
        this.horasTrabalhadasPorSemana = horasTrabalhadasPorSemana;
    }

    public String getAtividadeDesempenhadaNoTrabalho() {
        return atividadeDesempenhadaNoTrabalho;
    }

    public void setAtividadeDesempenhadaNoTrabalho(String atividadeDesempenhadaNoTrabalho) {
        this.atividadeDesempenhadaNoTrabalho = atividadeDesempenhadaNoTrabalho;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getDataUltimoExameFisico() {
        return dataUltimoExameFisico;
    }

    public void setDataUltimoExameFisico(String dataUltimoExameFisico) {
        this.dataUltimoExameFisico = dataUltimoExameFisico;
    }

    public String getCardiopatiaAntesDos50() {
        return cardiopatiaAntesDos50;
    }

    public void setCardiopatiaAntesDos50(String cardiopatiaAntesDos50) {
        this.cardiopatiaAntesDos50 = cardiopatiaAntesDos50;
    }

    public String getIntervencaoCirurgica() {
        return intervencaoCirurgica;
    }

    public void setIntervencaoCirurgica(String intervencaoCirurgica) {
        this.intervencaoCirurgica = intervencaoCirurgica;
    }

    public String getProblemasDiagnosticadosETratados() {
        return problemasDiagnosticadosETratados;
    }

    public void setProblemasDiagnosticadosETratados(String problemasDiagnosticadosETratados) {
        this.problemasDiagnosticadosETratados = problemasDiagnosticadosETratados;
    }

    public String getMedicamentosUtilizados() {
        return medicamentosUtilizados;
    }

    public void setMedicamentosUtilizados(String medicamentosUtilizados) {
        this.medicamentosUtilizados = medicamentosUtilizados;
    }

    public String getTosseComSangue() {
        return tosseComSangue;
    }

    public void setTosseComSangue(String tosseComSangue) {
        this.tosseComSangue = tosseComSangue;
    }

    public String getDorAbdominal() {
        return dorAbdominal;
    }

    public void setDorAbdominal(String dorAbdominal) {
        this.dorAbdominal = dorAbdominal;
    }

    public String getDorNasPernas() {
        return dorNasPernas;
    }

    public void setDorNasPernas(String dorNasPernas) {
        this.dorNasPernas = dorNasPernas;
    }

    public String getDorNosBracos() {
        return dorNosBracos;
    }

    public void setDorNosBracos(String dorNosBracos) {
        this.dorNosBracos = dorNosBracos;
    }

    public String getDorNasCostasOuPescoco() {
        return dorNasCostasOuPescoco;
    }

    public void setDorNasCostasOuPescoco(String dorNasCostasOuPescoco) {
        this.dorNasCostasOuPescoco = dorNasCostasOuPescoco;
    }

    public String getDorNoPeito() {
        return dorNoPeito;
    }

    public void setDorNoPeito(String dorNoPeito) {
        this.dorNoPeito = dorNoPeito;
    }

    public String getDoresArticulares() {
        return doresArticulares;
    }

    public void setDoresArticulares(String doresArticulares) {
        this.doresArticulares = doresArticulares;
    }

    public String getFaltaDeArComEsforcoLeve() {
        return faltaDeArComEsforcoLeve;
    }

    public void setFaltaDeArComEsforcoLeve(String faltaDeArComEsforcoLeve) {
        this.faltaDeArComEsforcoLeve = faltaDeArComEsforcoLeve;
    }

    public String getSentirFraqueza() {
        return sentirFraqueza;
    }

    public void setSentirFraqueza(String sentirFraqueza) {
        this.sentirFraqueza = sentirFraqueza;
    }

    public String getTontura() {
        return tontura;
    }

    public void setTontura(String tontura) {
        this.tontura = tontura;
    }

    public String getPalpitacaoOuBatimentoCardiacoAcelerado() {
        return palpitacaoOuBatimentoCardiacoAcelerado;
    }

    public void setPalpitacaoOuBatimentoCardiacoAcelerado(String palpitacaoOuBatimentoCardiacoAcelerado) {
        this.palpitacaoOuBatimentoCardiacoAcelerado = palpitacaoOuBatimentoCardiacoAcelerado;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getLesaoOsteoArticular() {
        return lesaoOsteoArticular;
    }

    public void setLesaoOsteoArticular(String lesaoOsteoArticular) {
        this.lesaoOsteoArticular = lesaoOsteoArticular;
    }

    public String getRestricaoAtividadeFisica() {
        return restricaoAtividadeFisica;
    }

    public void setRestricaoAtividadeFisica(String restricaoAtividadeFisica) {
        this.restricaoAtividadeFisica = restricaoAtividadeFisica;
    }

    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }

    public String getBebe() {
        return bebe;
    }

    public void setBebe(String bebe) {
        this.bebe = bebe;
    }

    public boolean isColesterol() {
        return colesterol;
    }

    public void setColesterol(boolean colesterol) {
        this.colesterol = colesterol;
    }

    public double getValorColesterol() {
        return valorColesterol;
    }

    public void setValorColesterol(double valorColesterol) {
        this.valorColesterol = valorColesterol;
    }

    public boolean isTriglicerides() {
        return triglicerides;
    }

    public void setTriglicerides(boolean triglicerides) {
        this.triglicerides = triglicerides;
    }

    public boolean isGlicodeAlta() {
        return glicodeAlta;
    }

    public void setGlicodeAlta(boolean glicodeAlta) {
        this.glicodeAlta = glicodeAlta;
    }

    public boolean isHipertensao() {
        return hipertensao;
    }

    public void setHipertensao(boolean hipertensao) {
        this.hipertensao = hipertensao;
    }

    public boolean isDiabetico() {
        return diabetico;
    }

    public void setDiabetico(boolean diabetico) {
        this.diabetico = diabetico;
    }

    public boolean isParenteDiabetico() {
        return parenteDiabetico;
    }

    public void setParenteDiabetico(boolean parenteDiabetico) {
        this.parenteDiabetico = parenteDiabetico;
    }

    public boolean isProblemasPulmonares() {
        return problemasPulmonares;
    }

    public void setProblemasPulmonares(boolean problemasPulmonares) {
        this.problemasPulmonares = problemasPulmonares;
    }

    public boolean isFoiCriancaObesaOuSobrepeso() {
        return foiCriancaObesaOuSobrepeso;
    }

    public void setFoiCriancaObesaOuSobrepeso(boolean foiCriancaObesaOuSobrepeso) {
        this.foiCriancaObesaOuSobrepeso = foiCriancaObesaOuSobrepeso;
    }

    public boolean isTemPaisObesosOuSobrepeso() {
        return temPaisObesosOuSobrepeso;
    }

    public void setTemPaisObesosOuSobrepeso(boolean temPaisObesosOuSobrepeso) {
        this.temPaisObesosOuSobrepeso = temPaisObesosOuSobrepeso;
    }

    public String getFazAtividadeFisica() {
        return fazAtividadeFisica;
    }

    public void setFazAtividadeFisica(String fazAtividadeFisica) {
        this.fazAtividadeFisica = fazAtividadeFisica;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getComentariosGerais() {
        return comentariosGerais;
    }

    public void setComentariosGerais(String comentariosGerais) {
        this.comentariosGerais = comentariosGerais;
    }

    @Override
    public Map<String, Object> getMapa() {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("peso", peso);
        mapa.put("altura", altura);
        mapa.put("dataPreenchimento", dataPreenchimento);
        mapa.put("fcRepouso", fcRepouso);
        mapa.put("gravidez", gravidez);
        mapa.put("qtdRefeicoesPorDia", qtdRefeicoesPorDia);
        mapa.put("dietaOuSuplementacao", dietaOuSuplementacao);
        mapa.put("qtdHorasDormidasPorNoite", qtdHorasDormidasPorNoite);
        mapa.put("horasTrabalhadasPorSemana", horasTrabalhadasPorSemana);
        mapa.put("atividadeDesempenhadaNoTrabalho", atividadeDesempenhadaNoTrabalho);
        mapa.put("obs", obs);

        mapa.put("dataUltimoExameFisico", dataUltimoExameFisico);
        mapa.put("cardiopatiaAntesDos50", cardiopatiaAntesDos50);
        mapa.put("intervencaoCirurgica", intervencaoCirurgica);
        mapa.put("problemasDiagnosticadosETratados", problemasDiagnosticadosETratados);
        mapa.put("medicamentosUtilizados", medicamentosUtilizados);

        mapa.put("tosseComSangue", tosseComSangue);
        mapa.put("dorAbdominal", dorAbdominal);
        mapa.put("dorNasPernas", dorNasPernas);
        mapa.put("dorNosBracos", dorNosBracos);
        mapa.put("dorNasCostasOuPescoco", dorNasCostasOuPescoco);
        mapa.put("dorNoPeito", dorNoPeito);
        mapa.put("doresArticulares", doresArticulares);
        mapa.put("faltaDeArComEsforcoLeve", faltaDeArComEsforcoLeve);
        mapa.put("sentirFraqueza", sentirFraqueza);
        mapa.put("tontura", tontura);
        mapa.put("palpitacaoOuBatimentoCardiacoAcelerado", palpitacaoOuBatimentoCardiacoAcelerado);
        mapa.put("alergia", alergia);
        mapa.put("lesaoOsteoArticular", lesaoOsteoArticular);
        mapa.put("restricaoAtividadeFisica", restricaoAtividadeFisica);

        mapa.put("fuma", fuma);
        mapa.put("bebe", bebe);
        mapa.put("colesterol", colesterol);
        mapa.put("valorColesterol", valorColesterol);
        mapa.put("triglicerides", triglicerides);
        mapa.put("glicodeAlta", glicodeAlta);
        mapa.put("hipertensao", hipertensao);
        mapa.put("diabetico", diabetico);
        mapa.put("parenteDiabetico", parenteDiabetico);
        mapa.put("problemasPulmonares", problemasPulmonares);
        mapa.put("foiCriancaObesaOuSobrepeso", foiCriancaObesaOuSobrepeso);
        mapa.put("temPaisObesosOuSobrepeso", temPaisObesosOuSobrepeso);
        mapa.put("fazAtividadeFisica", fazAtividadeFisica);
        mapa.put("objetivos", objetivos);
        mapa.put("comentariosGerais", comentariosGerais);

        return mapa;
    }

    @Override
    public void setMapa(Map<String, Object> mapa) {
        peso = (double) mapa.get("peso");
        altura = (double) mapa.get("altura");
        dataPreenchimento = (long) mapa.get("dataPreenchimento");
        fcRepouso = (double) mapa.get("fcRepouso");
        gravidez = (boolean) mapa.get("gravidez");
        qtdRefeicoesPorDia = (int) mapa.get("qtdRefeicoesPorDia");
        dietaOuSuplementacao = (String) mapa.get("dietaOuSuplementacao");
        qtdHorasDormidasPorNoite = (int) mapa.get("qtdHorasDormidasPorNoite");
        horasTrabalhadasPorSemana = (int) mapa.get("horasTrabalhadasPorSemana");
        atividadeDesempenhadaNoTrabalho = (String) mapa.get("atividadeDesempenhadaNoTrabalho");
        obs = (String) mapa.get("obs");

        dataUltimoExameFisico = (String) mapa.get("dataUltimoExameFisico");
        cardiopatiaAntesDos50 = (String) mapa.get("cardiopatiaAntesDos50");
        intervencaoCirurgica = (String) mapa.get("intervencaoCirurgica");
        problemasDiagnosticadosETratados = (String) mapa.get("problemasDiagnosticadosETratados");
        medicamentosUtilizados = (String) mapa.get("medicamentosUtilizados");

        tosseComSangue = (String) mapa.get("tosseComSangue");
        dorAbdominal = (String) mapa.get("dorAbdominal");
        dorNasPernas = (String) mapa.get("dorNasPernas");
        dorNosBracos = (String) mapa.get("dorNosBracos");
        dorNasCostasOuPescoco = (String) mapa.get("dorNasCostasOuPescoco");
        dorNoPeito = (String) mapa.get("dorNoPeito");
        doresArticulares = (String) mapa.get("doresArticulares");
        faltaDeArComEsforcoLeve = (String) mapa.get("faltaDeArComEsforcoLeve");
        sentirFraqueza = (String) mapa.get("sentirFraqueza");
        tontura = (String) mapa.get("tontura");
        palpitacaoOuBatimentoCardiacoAcelerado = (String) mapa.get("palpitacaoOuBatimentoCardiacoAcelerado");
        alergia = (String) mapa.get("alergia");
        lesaoOsteoArticular = (String) mapa.get("lesaoOsteoArticular");
        restricaoAtividadeFisica = (String) mapa.get("restricaoAtividadeFisica");

        fuma = (String) mapa.get("fuma");
        bebe = (String) mapa.get("bebe");
        colesterol = (boolean) mapa.get("colesterol");
        valorColesterol = (double) mapa.get("valorColesterol");
        triglicerides = (boolean) mapa.get("triglicerides");
        glicodeAlta = (boolean) mapa.get("glicodeAlta");
        hipertensao = (boolean) mapa.get("hipertensao");
        diabetico = (boolean) mapa.get("diabetico");
        parenteDiabetico = (boolean) mapa.get("parenteDiabetico");
        problemasPulmonares = (boolean) mapa.get("problemasPulmonares");
        foiCriancaObesaOuSobrepeso = (boolean) mapa.get("foiCriancaObesaOuSobrepeso");
        temPaisObesosOuSobrepeso = (boolean) mapa.get("temPaisObesosOuSobrepeso");
        fazAtividadeFisica = (String) mapa.get("fazAtividadeFisica");
        objetivos = (String) mapa.get("objetivos");
        comentariosGerais = (String) mapa.get("comentariosGerais");

    }

    public double getIMC () {
        if ( altura != 0 ) {
            return peso/altura/altura;
        } else {
            throw new IllegalArgumentException("A altura não pode ser zero!");
        }
    }
}
