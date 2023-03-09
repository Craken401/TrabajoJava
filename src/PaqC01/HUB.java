package PaqC01;

import java.util.Arrays;

public class HUB {
    private double [][] contenedores;
    private static final int columnas = 3;
    private int filas;

    public void Matriz(int filas, int columnas){
        this.filas = filas;
        this.contenedores = new double[filas][columnas];
    }


    public HUB(double[][] contenedores, int filas) {
        this.contenedores = contenedores;
        this.filas = filas;
    }

    public double[][] getContenedores() {
        return contenedores;
    }

    public void setContenedores(double[][] contenedores) {
        this.contenedores = contenedores;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }


    @Override
    public String toString() {
        return "HUB{" +
                "contenedores=" + Arrays.toString(contenedores) +
                ", filas=" + filas +
                '}';
    }
}
