package compania.controlador;

import compania.modelo.CompaniaAerea;
import java.util.ArrayList;

public class ControladorVuelo {
    private CompaniaAerea compania;

    public ControladorVuelo() {
        this.compania = CompaniaAerea.getInstancia();
    }

    public ArrayList<String> obtenerInfoVuelos() {
        return compania.obtenerInfoVuelos();
    }
}