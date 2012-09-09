package fredx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 9/9/12
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class TemperaturePanel extends JPanel {
    JLabel nowTemp = new JLabel("Now:");
    JLabel newT = new JLabel("~28 C");
    JLabel needTemp = new JLabel("Need temp:");
    JTextField needTempF = new JTextField(8);
    JButton app = new JButton("Apply");
    FlowLayout f = new FlowLayout(FlowLayout.LEFT);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    public TemperaturePanel (){
        f.setHgap(10);
    this.setLayout(new GridLayout(0,1));
    p1.setLayout(f);
    p1.add(nowTemp);
    p1.add(newT);
    this.add(p1);
    p2.setLayout(f);
    p2.add(needTemp);
    p2.add(needTempF);
    this.add(p2);
    this.add(app);
    app.addActionListener(new TestActionListener());
    }


    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }}
}
