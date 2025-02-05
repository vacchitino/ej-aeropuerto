package usuario;

import compania.controlador.ControladorVuelo;
import compania.vista.VistaPrincipal;
import compania.modelo.*;

public class Ejecucion {
    public static void main(String[] args) {
        // Obtener la instancia de la compañía aérea (Singleton)
        CompaniaAerea compania = CompaniaAerea.getInstancia();

        // Agregar vuelos de prueba
        compania.agregarVuelos(new VueloInternacional(1, "Buenos Aires", 500, 489, 1));
        compania.agregarVuelos(new VueloCabotaje(2, "Bariloche, Rio Negro", 350, 350, "Económico"));

        // Crear el controlador y la vista
        ControladorVuelo controlador = new ControladorVuelo();
        VistaPrincipal vista = new VistaPrincipal();

        // Conectar la vista con el controlador
        vista.setControlador(controlador);

        // Mostrar la vista
        vista.setVisible(true);
    }
}