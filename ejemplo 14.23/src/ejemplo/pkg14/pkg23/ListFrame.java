package ejemplo.pkg14.pkg23;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {
    private JList colorJList;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
        "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
        "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());
        colorJList = new JList(colorNames);
        JPanel p1 = new JPanel();
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        p1.add(new JScrollPane(colorJList));
        add(p1, BorderLayout.CENTER);
        colorJList.addListSelectionListener(
                new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                p1.setBackground(colors[colorJList.getSelectedIndex()]);
            }
        }
        );
    }
}
