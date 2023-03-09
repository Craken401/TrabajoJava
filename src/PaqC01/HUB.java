package PaqC01;

public class HUB {
    private Contenedor[][] contenedores;

    public HUB(Contenedor[][] contenedores) {
        this.contenedores = new Contenedor[10][12];
    }

    public Contenedor[][] getContenedores() {
        return contenedores;
    }

    public void setContenedores(Contenedor[][] contenedores) {
        this.contenedores = contenedores;
    }
}
