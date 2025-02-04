package usuario;
import compania.controlador.ControladorVuelo;
import compania.vista.VistaPrincipal;
import compania.modelo.*;

public class Ejecucion {
    public static void main(String[] args) {

        ControladorVuelo controladorVuelo = new ControladorVuelo();
        CompaniaAerea compania = CompaniaAerea.getInstancia();
        compania.agregarVuelos(new VueloInternacional(1, "Buenos Aires", 500, 489,1));
        compania.agregarVuelos(new VueloCabotaje(2, "Bariloche, Rio Negro", 350, 350, "Económico"));
        
        VistaPrincipal vista = new VistaPrincipal(controladorVuelo);
        vista.setVisible(true);

    }
    
}
