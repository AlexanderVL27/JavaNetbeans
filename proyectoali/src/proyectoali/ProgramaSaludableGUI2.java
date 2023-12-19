/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoali;

/**
 * 
 *
 * @author villa_xaz9a7o
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

public class ProgramaSaludableGUI2 {

    private static Map<String, String> consejos = new HashMap<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            cargarConsejos();
            createAndShowGUI();
        });
    }

    private static void cargarConsejos() {
        consejos.put("Verduras y Hortalizas", "Espinacas: Ricas en hierro, fibra y vitaminas.\n" +
"Brócoli: Fuente de vitamina C, fibra y compuestos antioxidantes.\n" +
"Zanahorias: Contienen betacarotenos que se convierten en vitamina A en el cuerpo.\n" +
"Pimientos: Excelente fuente de vitamina C y antioxidantes.");
        consejos.put("Frutas", "Manzanas: Contienen fibra y antioxidantes.\n" +
"Fresas: Bajas en calorías y ricas en vitamina C.\n" +
"Plátanos: Fuente de potasio y carbohidratos naturales.");
        consejos.put("Granos Integrales", "Avena: Rica en fibra soluble que ayuda a mantener estable el azúcar en sangre.\n" +
"Quinua: Contiene proteínas completas y es rica en minerales como el hierro y el magnesio.\n" +
"Arroz integral: Mayor contenido nutricional en comparación con el arroz blanco.");
        consejos.put("Legumbres", "Lentejas: Fuente de proteínas, fibra y hierro.\n" +
"Garbanzos: Contienen proteínas, fibra y folato.");
        consejos.put("Proteínas Magras", "Pechuga de pollo sin piel: Alta en proteínas y baja en grasas.\n" +
"Pavo: Otra fuente magra de proteínas.\n" +
"Pescado (salmón, trucha, sardinas): Rico en ácidos grasos omega-3 beneficiosos para el corazón.");
        consejos.put("Fuentes de Grasas Saludables", "Aguacate: Rico en grasas monoinsaturadas y potasio.\n" +
"Nueces: Contienen grasas saludables y antioxidantes.\n" +
"Aceite de oliva virgen extra: Buena fuente de grasas monoinsaturadas.");
        consejos.put("Productos lácteos bajos en grasa", "Yogur griego sin grasa: Alto en proteínas y calcio.\n" +
"Leche desnatada o baja en grasa: Fuente de calcio y vitamina D.");
        consejos.put("Especias y Hierbas", "Cúrcuma: Tiene propiedades antiinflamatorias.\n" +
"Ajo: Puede tener beneficios para la salud cardiovascular.\n" +
"Albahaca: Contiene antioxidantes y puede tener propiedades antiinflamatorias.");
        consejos.put("Bebidas Saludables", "Agua: Esencial para la hidratación y el funcionamiento adecuado del cuerpo.\n" +
"Té verde: Rico en antioxidantes y puede tener beneficios para la salud.");
        consejos.put("Opciones de Snacks Saludables", "Palitos de zanahoria con hummus: Combinación de verduras y proteínas.\n" +
"Frutas frescas: Una opción natural y dulce para satisfacer los antojos.");
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Programando para una vida saludable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

        ImageIcon veri = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\VERDURAS-Y-HORTALIZAS (1).jpg");
        ImageIcon frui = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\Frutas (1).jpg");
        ImageIcon grai = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\granos (1).jpg");
        ImageIcon legi = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\legumbres (1).jpg");
        ImageIcon protemi = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\Proteínas Magras (1).jpg");
        ImageIcon grasali = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\Fuentes de Grasas Saludables (1).jpg");
        ImageIcon lacteoi = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\Productos lácteos bajos en grasa (1).jpg");
        ImageIcon especiasi = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\Especias y Hierbas (1).jpg");
        ImageIcon bebidasi = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\bebidas.jpg");
        ImageIcon snacksi = new ImageIcon("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\proyectoali\\src\\proyectoali\\snaks (1).jpg");

        JLabel ver = new JLabel(veri);
        JLabel fru = new JLabel(frui);
        JLabel gra = new JLabel(grai);
        JLabel leg = new JLabel(legi);
        JLabel protem = new JLabel(protemi);
        JLabel grasal = new JLabel(grasali);
        JLabel lacteo = new JLabel(lacteoi);
        JLabel especias = new JLabel(especiasi);
        JLabel bebidas = new JLabel(bebidasi);
        JLabel snacks = new JLabel(snacksi);

        ver.addMouseListener(new ConsejoMouseListener("Verduras y Hortalizas"));
        fru.addMouseListener(new ConsejoMouseListener("Frutas"));
        gra.addMouseListener(new ConsejoMouseListener("Granos Integrales"));
        leg.addMouseListener(new ConsejoMouseListener("Legumbres"));
        protem.addMouseListener(new ConsejoMouseListener("Proteínas Magras"));
        grasal.addMouseListener(new ConsejoMouseListener("Fuentes de Grasas Saludables"));
        lacteo.addMouseListener(new ConsejoMouseListener("Productos lácteos bajos en grasa"));
        especias.addMouseListener(new ConsejoMouseListener("Especias y Hierbas"));
        bebidas.addMouseListener(new ConsejoMouseListener("Bebidas Saludables"));
        snacks.addMouseListener(new ConsejoMouseListener("Opciones de Snacks Saludables"));

        panel.add(ver);
        panel.add(fru);
        panel.add(gra);
        panel.add(leg);
        panel.add(protem);
        panel.add(grasal);
        panel.add(lacteo);
        panel.add(especias);
        panel.add(bebidas);
        panel.add(snacks);

        frame.getContentPane().add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private static class ConsejoMouseListener implements MouseListener {

        private String alimento;
        private JWindow consejoWindow;

        public ConsejoMouseListener(String alimento) {
            this.alimento = alimento;
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
            String consejo = consejos.get(alimento);
            if (consejo != null) {
                consejoWindow = new JWindow();
                JTextArea consejoTextArea = new JTextArea(consejo);
                consejoTextArea.setLineWrap(true);
                consejoTextArea.setWrapStyleWord(true);
                consejoTextArea.setEditable(false);
                consejoWindow.getContentPane().add(new JScrollPane(consejoTextArea));
                consejoWindow.setSize(300, 200); // Ajusta el tamaño de la ventana
                consejoWindow.setVisible(true);

                Point location = e.getLocationOnScreen();
                consejoWindow.setLocation(location.x + 20, location.y + 20);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (consejoWindow != null) {
                consejoWindow.dispose();
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
