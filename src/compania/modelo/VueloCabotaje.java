package compania.modelo;

public class VueloCabotaje extends Vuelo{
    private String categoria;

    public VueloCabotaje(int numeroVuelo, String destino, int maxPasajeros, int asientosOcup, String categoria) {
        super(numeroVuelo, destino, maxPasajeros, asientosOcup);
        this.categoria = categoria; 
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String obtenerTipoVuelo() {
        return "Cabotaje";
    }
    
    

}
