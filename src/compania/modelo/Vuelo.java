package compania.modelo;

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
    if(asientosOcup < 0) {
        System.out.println("¡Error! No se pueden asignar asientos negativos.");
    }else if (asientosOcup > maxPasajeros) {
        System.out.println("¡Error! No se puede asignar una cantidad de asientos que supere la capacidad máxima del avión.");
    }else {
        this.asientosOcup = asientosOcup;
    }   
}
public void verificarDisp() {
    if(getMaxPasajeros() == getAsientosOcup()) {
        System.out.println("No hay asientos disponibles en el vuelo");
    }
    else {
        System.out.println("Quedan " + (getMaxPasajeros() - getAsientosOcup()) + " asientos disponibles");
    }
}

public abstract String obtenerTipoVuelo();

}
