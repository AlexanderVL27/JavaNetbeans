/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasaludablegui3;

/**
 *
 * @author villa_xaz9a7o
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.Random;

public class ProgramaSaludableGUI3 {

    private static Map<String, List<String>> consejos = new HashMap<>();
    private static JFrame frame;
    private static String consejofijo = "\nEstos alimentos son componentes saludables para una dieta equilibrada y pueden proporcionar una variedad de nutrientes y beneficios para la salud cuando se consumen como parte de una alimentación balanceada.\n\n";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Programando para una vida saludable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 3, 10, 10));
        panel.setBackground(new Color(119, 204, 102));

        ImageIcon verdurasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\VERDURAS-Y-HORTALIZAS.jpg");
        ImageIcon frutasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\Frutas.jpg");
        ImageIcon granosIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\granos.jpg");
        ImageIcon legumbresIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\legumbres.jpg");
        ImageIcon proteinasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\Proteínas Magras.jpg");
        ImageIcon grasasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\Fuentes de Grasas Saludables.jpg");
        ImageIcon lacteoIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\Productos lácteos bajos en grasa.jpg");
        ImageIcon especiasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\Especias y Hierbas.jpg");
        ImageIcon bebidasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\Bebidas Saludables.jpg");
        ImageIcon snacksIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\snaks.jpg");
        ImageIcon fibraIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\fibra.jpg");
        ImageIcon algasIcon = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\ProgramaSaludableGUI3\\src\\programasaludablegui3\\algas.jpg");

        JButton verdurasButton = new JButton(verdurasIcon);
        verdurasButton.setBackground(new Color(153, 102, 204));
        JButton frutasButton = new JButton(frutasIcon);
        frutasButton.setBackground(new Color(153, 102, 204));
        JButton granosButton = new JButton(granosIcon);
        granosButton.setBackground(new Color(153, 102, 204));
        JButton legumbresButton = new JButton(legumbresIcon);
        legumbresButton.setBackground(new Color(153, 102, 204));
        JButton proteinasButton = new JButton(proteinasIcon);
        proteinasButton.setBackground(new Color(153, 102, 204));
        JButton grasasButton = new JButton(grasasIcon);
        grasasButton.setBackground(new Color(153, 102, 204));
        JButton especiasButton = new JButton(especiasIcon);
        especiasButton.setBackground(new Color(153, 102, 204));
        JButton bebidasButton = new JButton(bebidasIcon);
        bebidasButton.setBackground(new Color(153, 102, 204));
        JButton lacteoButton = new JButton(lacteoIcon);
        lacteoButton.setBackground(new Color(153, 102, 204));
        JButton snacksButton = new JButton(snacksIcon);
        snacksButton.setBackground(new Color(153, 102, 204));
        JButton fibraButton = new JButton(fibraIcon);
        snacksButton.setBackground(new Color(153, 102, 204));
        JButton algasButton = new JButton(algasIcon);
        snacksButton.setBackground(new Color(153, 102, 204));

        panel.add(verdurasButton);
        panel.add(frutasButton);
        panel.add(granosButton);
        panel.add(legumbresButton);
        panel.add(proteinasButton);
        panel.add(grasasButton);
        panel.add(especiasButton);
        panel.add(bebidasButton);
        panel.add(snacksButton);
        panel.add(lacteoButton);
        panel.add(fibraButton);
        panel.add(algasButton);

        JTextArea consejoTextArea = new JTextArea();
        consejoTextArea.setEditable(false);
        consejoTextArea.setWrapStyleWord(true);
        consejoTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(consejoTextArea);
        scrollPane.setPreferredSize(new Dimension(600, 100)); // Ajusta el tamaño del cuadro de texto

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);

        // Establecer la ventana en pantalla completa
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        verdurasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Verduras y Hortalizas";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        lacteoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Productos lácteos bajos en grasa";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frutasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Frutas";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        granosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Granos Integrales";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        legumbresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Legumbres";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        proteinasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Proteínas Magras";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        grasasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Fuentes de Grasas Saludables";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        especiasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Especias y Hierbas";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        bebidasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Bebidas Saludables";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        snacksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Opciones de Snacks Saludables";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        fibraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Alimentos Ricos en Fibra";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        algasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsejosNutricionales consejosManager = new ConsejosNutricionales();
                String categoriaElegida = "Algas Marinas";
                String consejoAleatorio = consejosManager.obtenerConsejoAleatorio(categoriaElegida);
                String mensaje = categoriaElegida + "\n" + consejoAleatorio + consejofijo;
                JOptionPane.showMessageDialog(null, mensaje, "Consejo Nutricional", JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }

}
