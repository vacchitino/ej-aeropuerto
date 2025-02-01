package compania;

public class VueloInternacional extends Vuelo implements Reservable{
    private int cantEscalas;

    public VueloInternacional(int numeroVuelo, String destino, int maxPasajeros, int asientosOcup) {
        super(numeroVuelo, destino, maxPasajeros, asientosOcup);
        //TODO Auto-generated constructor stub
    }

    public int getCantEscalas() {
        return cantEscalas;
    }

    public void setCantEscalas(int cantEscalas) {
        this.cantEscalas = cantEscalas;
    }

    @Override
    public void verificarDisp() {
        if(getMaxPasajeros() == getAsientosOcup()) {
            System.out.println("No hay asientos disponibles en el vuelo");
        }
        else {
            System.out.println("Quedan " + (getMaxPasajeros() - getAsientosOcup()) + " asientos disponibles");
        }
    }

    @Override
    public String obtenerTipoVuelo() {
       return "Internacional";
    }

    public int cantidadEscalas() {
        return cantEscalas;
    }
    

}
