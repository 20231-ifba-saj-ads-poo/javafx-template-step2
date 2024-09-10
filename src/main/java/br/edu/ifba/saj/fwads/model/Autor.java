package br.edu.ifba.saj.fwads.model;

public class Autor {
    private Long id;
    private static Long idGenerator = 0l;
    private String nome;
    private String email;
    private String CPF;
    public Autor(String nome, String email, String cPF) {
        this.id = ++idGenerator;
        this.nome = nome;
        this.email = email;
        CPF = cPF;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    @Override
    public String toString() {
        return "Autor [id=" + id + ", nome=" + nome + ", email=" + email + ", CPF=" + CPF + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Autor other = (Autor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    
}
