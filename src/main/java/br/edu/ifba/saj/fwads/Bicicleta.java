package br.edu.ifba.saj.fwads;

public class Bicicleta {
    private int id;
    private static int numeroDeBicicletas = 0;
    public Bicicleta(){
        this.id = ++numeroDeBicicletas;
    }
    public int getId() {
        return this.id;
    }
    public static int getNumeroDeBicicletas() {
        return numeroDeBicicletas;
    }
    @Override
    public String toString() {
        return "Bicicleta [id=" + id + "]";
    }
    
    public static void main(String[] args) {
        
        Bicicleta b1 = new Bicicleta();
        System.out.println(b1);
        System.out.println(Bicicleta.numeroDeBicicletas);
        Bicicleta b2 = new Bicicleta();
        System.out.println(b2);
        System.out.println(Bicicleta.numeroDeBicicletas);
    }
}






