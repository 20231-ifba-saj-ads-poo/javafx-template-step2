package br.edu.ifba.saj.fwads.model;

public class Aluno extends UsuarioBiblioteca {
    private String matricula; 

    public Aluno(String CPF, String nome, String matricula) {
        super(CPF, nome);  
        this.matricula = matricula;
        setLimite(2);      
    }

    public String getMatricula() {
        return matricula;
    }
    
}
