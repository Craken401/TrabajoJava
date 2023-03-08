package PaqC01;

import java.util.Arrays;

public class HUB extends Contenedor {
    private Contenedor[][] contenedores;

    public HUB(int numeroIdentf, int pesoCont, String pais, boolean aduanas, int prioridad, String descripcion, String nombreEmpresaEnvia, String nombreEmpresaRecibe) {
        super(numeroIdentf, pesoCont, pais, aduanas, prioridad, descripcion, nombreEmpresaEnvia, nombreEmpresaRecibe);
        contenedores = new Contenedor[10][12];
    }

    public Contenedor[][] getContenedores() {
        return contenedores;
    }

    public void setContenedores(Contenedor[][] contenedores) {
        this.contenedores = contenedores;
    }
}
