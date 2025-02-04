
package compania.vista;
import javax.swing.*;
import java.awt.*;
import compania.controlador.ControladorVuelo;
    
public class VistaPrincipal extends JFrame {
    private JButton btnMostrarVuelos;
    private JTextArea txtVuelos;
    
    public VistaPrincipal(ControladorVuelo controlador) {
        setTitle("Sistema de Vuelos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    
        txtVuelos = new JTextArea();
        txtVuelos.setEditable(false);
        add(new JScrollPane(txtVuelos), BorderLayout.CENTER);
    
        btnMostrarVuelos = new JButton("Mostrar Vuelos");
        btnMostrarVuelos.addActionListener(e -> controlador.mostrarVuelo(txtVuelos));
        add(btnMostrarVuelos, BorderLayout.SOUTH);
        }
    }
    
