package fredx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimerTask;

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
    public static JTextField cycleNew = new JTextField(8);
    public static JTextField cycleNewLenght = new JTextField(8);
    JButton button = new JButton("Apply");
    JButton button1 = new JButton("Cancel");
    FlowLayout f = new FlowLayout(FlowLayout.LEFT);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    java.util.Timer timer = new java.util.Timer();
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
    p3.setLayout(f);
    p3.add(button);
    p3.add(button1);
    this.add(p3);
    button.addActionListener(new TestActionListener1());
    button1.addActionListener(new TestActionListener2());
    this.setPreferredSize(new Dimension(520, 160));
    }
    public class TestActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cycleStatusLabel.setText(cycleNew.getText());
            cycleLengthLabel.setText(cycleNewLenght.getText());
            StatusPanel.l22.setText(cycleNew.getText());
            StatusPanel.l23.setText(cycleLength.getText());
            timer = new java.util.Timer();
            TimerTask task1 = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Aeroponic system on");
                    Init.lOG.append(new Date()+" Aeroponic system on\n");
                    Init.NEXT_Aeroponic=new Date();
                    //aeroponic on(length);
                }
            }       ;
            timer.schedule(task1,new Date(),Integer.parseInt(cycleNew.getText())*60000);

}}
    public class TestActionListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            timer.cancel();
            cycleNew.setText("Cancelled");
            cycleNewLenght.setText("Cancelled");
            Init.lOG.append(new Date()+" Aeroponic system stopped\n");

        }}
}