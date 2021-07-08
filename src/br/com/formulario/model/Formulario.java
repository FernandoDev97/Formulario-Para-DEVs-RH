package br.com.formulario.model;

import java.util.List;
import javax.swing.JRadioButton;

public class Formulario {

    private String nome;
    private String sobrenome;
    private String aplicacao;
    private String senioridade;
    private List<String> tecnologias;

    public Formulario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public void setAplicacao(JRadioButton radioFront, JRadioButton radioBack, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
