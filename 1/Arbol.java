package edu.upc.eetac.dsa.ejecicios.java.lang;


public class Arbol {

    private int altura;
    private  String nombre;

    public Arbol (){
       // System.out.println("Un arbol");
    }
    public Arbol (int altura){
        this.altura= altura;
       // System.out.println("Un arbol de "+ altura+" metros");
    }
    public Arbol (String nombre){
        this.nombre = nombre;
       // System.out.println("un "+ nombre);

    }
    public Arbol (int altura, String nombre){
        this.altura = altura;
        this.nombre = nombre;
       // System.out.println("un "+nombre+" de "+ altura+" metros");
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
