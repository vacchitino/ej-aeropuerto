package compania;
import java.util.ArrayList;

public class CompaniaAerea {
    public String nombre;
    public ArrayList<Vuelo> listaVuelos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }
    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public void agregarVuelos() { //Terimnar
    }
        
}
