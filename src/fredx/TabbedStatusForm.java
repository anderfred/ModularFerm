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
    JPanel panelLight = new JPanel();
    JPanel panelRain = new JPanel();
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
        panelLight.setLayout(new GridLayout(0,4));
        panelLight.add(l1);
        panelLight.add(slider3);
        slider3.setBorder(BorderFactory.createTitledBorder(""));
        slider3.setMajorTickSpacing(20);
        slider3.setMinorTickSpacing(5);
        slider3.setPaintTicks(true);
        slider3.setPaintLabels(false);
        panelLight.add(lc3);
        panelLight.add(new JLabel("State:"));
        panelLight.add(l2);
        panelLight.add(lStart);       //text field start light
        panelLight.add(lc1);
        panelLight.add(lc6); //ok
        panelLight.add(l3);
        panelLight.add(lEnd);           //text field end light
        panelLight.add(lc2);
        panelLight.add(lc4); //ok
        panelLight.add(l4);
        panelLight.add(lc5);
        panelLight.add(new JLabel(""));
        panelLight.add(lcc);
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lc3.setText(String.valueOf(slider3.getValue()) + "%");
            }
        });
        panelLight.setPreferredSize(new Dimension(570, 260));
        tabbedPane.setFont(font);
        tabbedPane.addTab("Ligth Control", panelLight);
        tabbedPane.addTab("Rain Control",panelRain);
        main.add(tabbedPane);
        lcc.addActionListener(new TestActionListener());
        //main.setLayout(new GridLayout(4,4)); //GrigLayout(x,y) x-столбцы y ряды
        getContentPane().add(main);
        setPreferredSize(new Dimension(590, 390));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss", Locale.US);
            //Код, который нужно выполнить при нажатии
            //for(JButton b:buttons){if (e.getSource()==b){ddddLabel.setText(b.getText()); break;}}
            try {
                lc1.setText(sm.format(sm.parse(lStart.getText())));
                Ferm.LIGHT_START= sm.parse(lStart.getText());
                System.out.println(sm.parse(lStart.getText()));
            } catch (ParseException e1) {
                e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            try {
                lc2.setText(sm.format(sm.parse(lEnd.getText())));
                Ferm.LIGHT_END=sm.parse(lEnd.getText());
            } catch (ParseException e1) {
                e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            //Ferm.LIGHT_CYCLE=1000*Integer.parseInt(lightNew.getText());
            //Ferm.RAIN_CYCLE=1000*Integer.parseInt(rainNew.getText());
            //statLight=new JLabel(""+Ferm.LIGHT_CYCLE/1000+" sec");
            //statRain=new JLabel(""+Ferm.RAIN_CYCLE/1000+" sec");

        }
    }
}
