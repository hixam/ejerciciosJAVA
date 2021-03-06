package edu.upc.eetac.dsa.exercises.java.lang;

import java.nio.Buffer;


public class Productores implements Runnable {

    private  ClaseBuffer buffer =null;
    private String linea = null;

    public Productores (ClaseBuffer buffer, String linea){
        this.buffer=buffer;
        this.linea=linea;
    }
@Override
    public  void run (){
        char chars [] = linea.toCharArray();
        for ( char c : chars){
            buffer.put(c);
        }
    }
}
