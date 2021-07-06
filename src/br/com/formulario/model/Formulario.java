
package br.com.formulario.model;

import javax.swing.JRadioButton;

public class Formulario {
        
       private String nome;
       private String sobrenome;
       private String aplicacao;
       private String senioridade;
       private String tecnologias;
       
       

       public Formulario (){
       
       }

    public Formulario(String nome, String sobrenome, String aplicacao, String senioridade, String tecnologias) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.aplicacao = aplicacao;
        this.senioridade = senioridade;
        this.tecnologias = tecnologias;
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

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public void setAplicacao(JRadioButton radioFront, JRadioButton radioBack, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

    
    
    }


   
       

       
       
    

