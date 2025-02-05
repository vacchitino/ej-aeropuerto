package compania.modelo;

public class VueloInternacional extends Vuelo{
    private int cantEscalas;

    public VueloInternacional(int numeroVuelo, String destino, int maxPasajeros, int asientosOcup, int cantEscalas) {
        super(numeroVuelo, destino, maxPasajeros, asientosOcup);
        this.cantEscalas = cantEscalas;
    }

    public int getCantEscalas() {
        return cantEscalas;
    }

    public void setCantEscalas(int cantEscalas) {
        this.cantEscalas = cantEscalas;
    }

    @Override
    public String obtenerTipoVuelo() {
       return "Internacional";
    }

    public int cantidadEscalas() {
        return cantEscalas;
    }
    

}
