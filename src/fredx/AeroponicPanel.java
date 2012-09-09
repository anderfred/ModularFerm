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
    JLabel cycleLabel = new JLabel("Cycle time:  mm");
    JLabel cycleLength = new JLabel("Length: ss");
    JLabel cycleStatusLabel = new JLabel("");
    JLabel cycleLengthLabel = new JLabel("");
    JTextField cycleNew = new JTextField(8);
    JTextField cycleNewLenght = new JTextField(8);
    JButton button = new JButton("Apply");
    FlowLayout f = new FlowLayout(FlowLayout.LEFT);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    public AeroponicPanel(){
    setLayout(new GridLayout(0,1));
    f.setHgap(9);
    p1.setLayout(f);
    p1.add(cycleLabel);
    p1.add(cycleStatusLabel);
    p1.add(cycleNew);
    this.add(p1);
    p2.setLayout(f);
    p2.add(cycleLength);
    p2.add(cycleLengthLabel);
    p2.add(cycleNewLenght);
    this.add(p2);
    this.add(button);
    button.addActionListener(new TestActionListener1());
    this.setPreferredSize(new Dimension(570, 260));
    }
    public class TestActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cycleStatusLabel.setText(cycleNew.getText());
            cycleLengthLabel.setText(cycleNewLenght.getText());
}}
}