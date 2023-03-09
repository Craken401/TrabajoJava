package PaqC01;

public class Contenedor {

    private int NumeroIdentf;
    private int PesoCont;
    private String Pais;
    boolean aduanas;
    private int prioridad;
    private String descripcion;
    private String NombreEmpresaEnvia;
    private String NombreEmpresaRecibe;


    public Contenedor(int numeroIdentf, int pesoCont, String pais, boolean aduanas, int prioridad, String descripcion, String nombreEmpresaEnvia, String nombreEmpresaRecibe) {
        NumeroIdentf = numeroIdentf;
        PesoCont = pesoCont;
        Pais = pais;
        this.aduanas = aduanas;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        NombreEmpresaEnvia = nombreEmpresaEnvia;
        NombreEmpresaRecibe = nombreEmpresaRecibe;
    }

    public void apilarContenedor(int prioridad){

        int contenedor1 = 0, contenedor2 = 0, contenedor3 = 0;

        if (prioridad == 1){
            contenedor1 += 1;
        }
        if (prioridad == 2){
            contenedor2 += 1;
        }
        if (prioridad == 3){
            contenedor3 += 1;
        }
    }



    public int getNumeroIdentf() {
        return NumeroIdentf;
    }

    public void setNumeroIdentf(int numeroIdentf) {
        NumeroIdentf = numeroIdentf;
    }

    public int getPesoCont() {
        return PesoCont;
    }

    public void setPesoCont(int pesoCont) {
        PesoCont = pesoCont;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public boolean isAduanas() {
        return aduanas;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas = aduanas;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreEmpresaEnvia() {
        return NombreEmpresaEnvia;
    }

    public void setNombreEmpresaEnvia(String nombreEmpresaEnvia) {
        NombreEmpresaEnvia = nombreEmpresaEnvia;
    }

    public String getNombreEmpresaRecibe() {
        return NombreEmpresaRecibe;
    }

    public void setNombreEmpresaRecibe(String nombreEmpresaRecibe) {
        NombreEmpresaRecibe = nombreEmpresaRecibe;
    }
}
