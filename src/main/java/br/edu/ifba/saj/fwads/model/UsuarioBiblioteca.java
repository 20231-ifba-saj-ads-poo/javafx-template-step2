package br.edu.ifba.saj.fwads.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBiblioteca {
    private String CPF;
    private String nome;
    private List<Livro> mochila;
    private int limite;
   

    public UsuarioBiblioteca(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
        this.mochila = new ArrayList<>();
        this.limite = 0;
    }

    protected void setLimite(int limite) {
        if(limite > 0){
            this.limite = limite;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
    
    public int getLimite() {
        return limite;
    }
    public boolean mochilaCheia(){
        return mochila.size() == limite;
    }

    
}
