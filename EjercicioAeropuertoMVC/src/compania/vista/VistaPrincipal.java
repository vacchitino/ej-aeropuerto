package compania.vista;

import javax.swing.*;

import compania.controlador.ControladorVuelo;

import java.awt.*;
import java.util.ArrayList;

public class VistaPrincipal extends JFrame {
    private JButton btnMostrarVuelos;
    private JTextArea txtVuelos;
    private ControladorVuelo controlador;

    public VistaPrincipal() {
        setTitle("Sistema de Vuelos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        txtVuelos = new JTextArea();
        txtVuelos.setEditable(false);
        add(new JScrollPane(txtVuelos), BorderLayout.CENTER);

        btnMostrarVuelos = new JButton("Mostrar Vuelos");
        btnMostrarVuelos.addActionListener(e -> mostrarVuelos());
        add(btnMostrarVuelos, BorderLayout.SOUTH);
    }

    public void setControlador(ControladorVuelo controlador) {
        this.controlador = controlador;
    }

    private void mostrarVuelos() {
        if (controlador != null) {
            ArrayList<String> vuelosInfo = controlador.obtenerInfoVuelos();
            actualizarListaVuelos(vuelosInfo);
        }
    }

    public void actualizarListaVuelos(ArrayList<String> vuelosInfo) {
        StringBuilder info = new StringBuilder();
        for (String vuelo : vuelosInfo) {
            info.append(vuelo).append("\n");
        }
        txtVuelos.setText(info.toString());
    }
}