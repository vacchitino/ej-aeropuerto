package compania.controlador;
import compania.modelo.CompaniaAerea;
import compania.modelo.Vuelo;
import javax.swing.*;


public class ControladorVuelo {
    private CompaniaAerea compania;

    public ControladorVuelo() {
        this.compania = CompaniaAerea.getInstancia();
    }
    public void mostrarVuelo(JTextArea txtVuelos) {
        StringBuilder info = new StringBuilder();
        for(Vuelo v : compania.getListaVuelos()) {
            info.append("Vuelo").append(v.getNumeroVuelo()).append(" - Destino: ").append(v.getDestino()).append(" - Tipo: ").append(v.obtenerTipoVuelo()).append("\n");
        }
        txtVuelos.setText(info.toString());
    }

}
