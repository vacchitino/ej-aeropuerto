package compania;

public abstract class Vuelo{
   private int numeroVuelo;
   private String destino;
   private int maxPasajeros;
   private int asientosOcup;

   
public Vuelo(int numeroVuelo, String destino, int maxPasajeros, int asientosOcup) {
    this.numeroVuelo = numeroVuelo;
    this.destino = destino;
    this.maxPasajeros = maxPasajeros;
    this.asientosOcup = asientosOcup;
}
public int getNumeroVuelo() {
    return numeroVuelo;
}
public void setNumeroVuelo(int numeroVuelo) {
    this.numeroVuelo = numeroVuelo;
}
public String getDestino() {
    return destino;
}
public void setDestino(String destino) {
    this.destino = destino;
}
public int getMaxPasajeros() {
    return maxPasajeros;
}
public void setMaxPasajeros(int maxPasajeros) {
    this.maxPasajeros = maxPasajeros;
}
public int getAsientosOcup() {
    return asientosOcup;
}
protected void setAsientosOcup(int asientosOcup) {
    if(asientosOcup <= maxPasajeros) {
        this.asientosOcup = asientosOcup;
    }
    else {
        System.out.println("¡Error! No se puede superar la capacidad maxima de pasajeros. ");
    }
        
}
public abstract String obtenerTipoVuelo();

   
}
