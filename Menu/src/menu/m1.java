package menu;
import javax.swing.*;
import static java.awt.event.InputEvent.*;

/**
 *
 * @author villa_xaz9a7o
 */
public class m1 extends JFrame {

    public m1(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        JMenu ﬁleMenu = new JMenu("File");
        JMenu elementMenu = new JMenu("Elements");
        newItem = ﬁleMenu.add("New");
        openItem = ﬁleMenu.add("Open");
        closeItem = ﬁleMenu.add("Close");
        ﬁleMenu.addSeparator();
        saveItem = ﬁleMenu.add("Save");
        saveAsItem = ﬁleMenu.add("Save As...");
        ﬁleMenu.addSeparator();
        printItem = ﬁleMenu.add("Print");
        newItem.setAccelerator(KeyStroke.getKeyStroke('N', CTRL_DOWN_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke('O',CTRL_DOWN_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke('S',CTRL_DOWN_MASK));
        printItem.setAccelerator(KeyStroke.getKeyStroke('P',CTRL_DOWN_MASK));
        elementMenu.add(lineItem = new JRadioButtonMenuItem("Line", true));
        elementMenu.add(rectangleItem = new JRadioButtonMenuItem("Rectangle", false));
        elementMenu.add(circleItem = new JRadioButtonMenuItem("Circle", false));
        elementMenu.add(curveItem = new JRadioButtonMenuItem("Curve", false));
        ButtonGroup types = new ButtonGroup();
        types.add(lineItem);
        types.add(rectangleItem);
        types.add(circleItem);
        types.add(curveItem);
        lineItem.setAccelerator(KeyStroke.getKeyStroke('L',CTRL_DOWN_MASK));
        rectangleItem.setAccelerator(KeyStroke.getKeyStroke('E', CTRL_DOWN_MASK));
        circleItem.setAccelerator(KeyStroke.getKeyStroke('I',CTRL_DOWN_MASK));
        curveItem.setAccelerator(KeyStroke.getKeyStroke('V',CTRL_DOWN_MASK));
        elementMenu.addSeparator();
        JMenu colorMenu = new JMenu("Color");  
        elementMenu.add(colorMenu);            
        colorMenu.add(redItem = new JCheckBoxMenuItem("Red", false));
        colorMenu.add(yellowItem = new JCheckBoxMenuItem("Yellow", false));
        colorMenu.add(greenItem = new JCheckBoxMenuItem("Green", false));
        colorMenu.add(blueItem = new JCheckBoxMenuItem("Blue", true));
        redItem.setAccelerator(KeyStroke.getKeyStroke('R',CTRL_DOWN_MASK));
        yellowItem.setAccelerator(KeyStroke.getKeyStroke('Y',CTRL_DOWN_MASK));
        greenItem.setAccelerator(KeyStroke.getKeyStroke('G',CTRL_DOWN_MASK));
        blueItem.setAccelerator(KeyStroke.getKeyStroke('B',CTRL_DOWN_MASK));
        menuBar.add(ﬁleMenu);
        menuBar.add(elementMenu);
    }

    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem newItem, openItem, closeItem, saveItem,saveAsItem, printItem;
    private JRadioButtonMenuItem lineItem, rectangleItem, circleItem, curveItem, textItem;
    private JCheckBoxMenuItem redItem, yellowItem,greenItem, blueItem;
}
