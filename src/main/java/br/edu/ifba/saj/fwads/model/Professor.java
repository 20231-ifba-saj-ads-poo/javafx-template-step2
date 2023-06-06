package br.edu.ifba.saj.fwads.model;

public class Professor extends UsuarioBiblioteca {
    private String SIAPE;

    public Professor(String CPF, String nome, String SIAPE) {
        super(CPF, nome);
        this.SIAPE = SIAPE;
        setLimite(5);
    }

    public String getSIAPE() {
        return SIAPE;
    }
}
