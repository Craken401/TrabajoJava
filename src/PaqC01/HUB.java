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

    @Override
    public Contenedor toString() {
        Contenedor plano = new Contenedor();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                plano = plano + String.valueOf(contenedores[i][j]) + " ";
            }
            plano = plano + "\n";
        }
        return plano;
    }
}
