package compania.modelo;
import java.util.ArrayList;

public class CompaniaAerea {
    private static CompaniaAerea instancia;
    private String nombre;
    private ArrayList<Vuelo> listaVuelos;

    private CompaniaAerea(String nombre) { //Constructor privado para evitar la instanciacion externa, SINGLETON
        this.nombre = nombre;
        this.listaVuelos = new ArrayList<>();
    }
    public static CompaniaAerea getInstancia() { //Singleton
        if(instancia == null) {
            instancia = new CompaniaAerea("Aerolineas Vacchini");
        }
        return instancia;
    }

    /*public static void setInstancia(CompaniaAerea instancia) {
        CompaniaAerea.instancia = instancia;
    }*/ //NO EXISTE EL METODO set en Singleton
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void agregarVuelos(Vuelo vuelo) {
         listaVuelos.add(vuelo);
    }

    
        
}
