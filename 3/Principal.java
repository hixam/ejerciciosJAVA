package edu.upc.eetac.dsa.exercises.java.lang;

import java.io.IOException;


public class Principal {
    public static void main (String args[]) throws IOException {
        LeerFichero leerFichero= new LeerFichero();
        leerFichero.muestraContenido("/home/marcelus/IdeaProjects/Ejercicio3FicheroTipoTexto/src/edu/upc/eetac/dsa/exercises/java/lang/numeros.txt");

    }
}
