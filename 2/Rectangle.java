package edu.upc.eetac.dsa.exercises.java.lang;


public class Rectangle extends Abstracto {

    private double ii;
    private double jj;

    public Rectangle (double i, double j){
        super("Rectangulo");
        this.ii= i;
        this.jj=j;
    }
    public double area(){
        return ii*jj;
    }
}
