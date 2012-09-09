package fredx;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 9/1/12
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class TabbedStatusForm extends JFrame {
    static int i = 0;
    LightPanel panelLight = new LightPanel();
    JPanel panelRain = new JPanel();
    TemperaturePanel tempPanel = new TemperaturePanel();
    AeroponicPanel aeroponicPanel = new AeroponicPanel();
    LogPanel log = new LogPanel();
    JLabel l1 = new JLabel("Intestivity");
    JPanel main = new JPanel();
    JLabel l2 = new JLabel("Start time:");
    JLabel l3 = new JLabel("End time:");
    JLabel l4 = new JLabel("Present time:");
    JLabel lc1 = new JLabel("None");
    JLabel lc2 = new JLabel("None");
    JLabel lc3 = new JLabel("");
    JLabel lc4 = new JLabel("");
    JLabel lc5 = new JLabel("");
    JLabel lc6 = new JLabel("");
    JButton lcc = new JButton("Apply");
    JTextField lStart = new JTextField();
    JTextField lEnd = new JTextField();
    JSlider slider3 = new JSlider();

    public TabbedStatusForm() {

        super("Modular Ferm Control System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 10);
        final JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.setFont(font);
        tabbedPane.addTab("Ligth Control", panelLight);
        tabbedPane.addTab("Aeroponic Control",aeroponicPanel);
        tabbedPane.addTab("Temperature control",tempPanel);
        tabbedPane.addTab("Log",log);
        main.add(tabbedPane);
        lcc.addActionListener(new TestActionListener());
        getContentPane().add(main);
        setPreferredSize(new Dimension(590, 390));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
