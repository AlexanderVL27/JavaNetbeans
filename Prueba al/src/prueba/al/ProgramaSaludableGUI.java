/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.al;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaSaludableGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Programando para una vida saludable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Componentes
        JComboBox<String> alimentosComboBox = new JComboBox<>(new String[]{"Salmón", "Espinacas", "Manzanas", "Nueces"});
        JComboBox<String> enfermedadesComboBox = new JComboBox<>(new String[]{"Enfermedades del corazón", "Hipertensión", "Diabetes tipo 2", "Cáncer"});
        JTextArea consejoTextArea = new JTextArea(10, 30);
        consejoTextArea.setLineWrap(true);
        consejoTextArea.setWrapStyleWord(true);
        consejoTextArea.setEditable(false);
        
        JButton obtenerConsejoButton = new JButton("Obtener Consejo");
        obtenerConsejoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alimentoSeleccionado = (String) alimentosComboBox.getSelectedItem();
                String enfermedadSeleccionada = (String) enfermedadesComboBox.getSelectedItem();
                String consejo = obtenerConsejo(alimentoSeleccionado, enfermedadSeleccionada);
                consejoTextArea.setText(consejo);
            }
        });
        
        // Diseño de la interfaz
        JPanel panel = new JPanel();
        panel.add(new JLabel("Selecciona un alimento:"));
        panel.add(alimentosComboBox);
        panel.add(new JLabel("Selecciona una enfermedad:"));
        panel.add(enfermedadesComboBox);
        panel.add(obtenerConsejoButton);
        panel.add(new JScrollPane(consejoTextArea));
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static String obtenerConsejo(String alimento, String enfermedad) {
    String consejo = "";

    if (alimento.equals("Salmón")) {
        if (enfermedad.equals("Enfermedades del corazón")) {
            consejo = "El salmón es rico en ácidos grasos omega-3 que pueden ayudar a mejorar la salud cardiovascular.";
        } else if (enfermedad.equals("Diabetes tipo 2")) {
            consejo = "El salmón es una fuente de proteínas magras que puede ser una buena opción para controlar los niveles de azúcar en sangre.";
        }
    } else if (alimento.equals("Espinacas")) {
        if (enfermedad.equals("Hipertensión")) {
            consejo = "Las espinacas son una excelente fuente de potasio, que puede contribuir a mantener la presión arterial en niveles saludables.";
        }
    } else if (alimento.equals("Manzanas")) {
        if (enfermedad.equals("Diabetes tipo 2")) {
            consejo = "Las manzanas son ricas en fibra y tienen un índice glucémico bajo, lo que las hace una buena opción para el control de azúcar en sangre.";
        }
    } else if (alimento.equals("Nueces")) {
        if (enfermedad.equals("Enfermedades del corazón")) {
            consejo = "Las nueces contienen grasas saludables y antioxidantes que pueden ser beneficiosos para la salud cardiovascular.";
        } else if (enfermedad.equals("Cáncer")) {
            consejo = "Las nueces son una fuente de antioxidantes que podrían ayudar a combatir el estrés oxidativo y reducir el riesgo de ciertos tipos de cáncer.";
        }
    }
    // Puedes seguir agregando más condiciones para otros alimentos y enfermedades

    return consejo;
}
}

