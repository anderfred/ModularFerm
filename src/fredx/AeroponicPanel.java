package fredx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 9/3/12
 * Time: 12:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class AeroponicPanel extends JPanel {
    JLabel cycleLabel = new JLabel("Cycle time:");
    JLabel cycleLength = new JLabel("Length:");
    JLabel cycleStatusLabel = new JLabel("None");
    JLabel cycleLengthLabel = new JLabel("None");
    JTextField cycleNew = new JTextField();
    JTextField cycleNewLenght = new JTextField();
    JButton button = new JButton("Apply");
    public AeroponicPanel(){setLayout(new GridLayout(0,3));
    this.add(cycleLabel);
    this.add(cycleStatusLabel);
    this.add(cycleNew);
    this.add(cycleLength);
    this.add(cycleLengthLabel);
    this.add(cycleNewLenght);
    this.add(button);
    button.addActionListener(new TestActionListener1());
    this.setPreferredSize(new Dimension(570, 260));
    }
    public class TestActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Код, который нужно выполнить при нажатии
            //for(JButton b:buttons){if (e.getSource()==b){ddddLabel.setText(b.getText()); break;}}
            cycleStatusLabel.setText(cycleNew.getText());
            cycleLengthLabel.setText(cycleNewLenght.getText());
}}
}