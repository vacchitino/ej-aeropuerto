package compania;

public class VueloCabotaje extends Vuelo implements Reservable{
    private String categoria;

    public VueloCabotaje(int numeroVuelo, String destino, int maxPasajeros, int asientosOcup) {
        super(numeroVuelo, destino, maxPasajeros, asientosOcup);
    
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        return "Cabotaje";
    }
    
    

}
