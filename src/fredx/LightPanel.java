package fredx;

import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 9/3/12
 * Time: 12:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class LightPanel extends JPanel {


    JLabel l1 = new JLabel("Intestivity");
    JLabel l2 = new JLabel("Start time:");
    JLabel l3 = new JLabel("End time:");
    JLabel l4 = new JLabel("Present time:");
    JLabel lc1 = new JLabel("None");
    JLabel lc2 = new JLabel("None");
    JLabel lc3 = new JLabel("50%");
    JLabel lc4 = new JLabel("");
    JLabel lc5 = new JLabel("");
    JLabel lc6 = new JLabel("");
    JButton lcc = new JButton("Apply");
    JTextField lStartHh = new JTextField();
    JTextField lStartMm = new JTextField();
    JTextField lEndHh = new JTextField();
    JTextField lEndMm  = new JTextField();
    JSlider slider3 = new JSlider();
    public LightPanel(){
        this.setLayout(new GridLayout(0, 5));
        this.add(l1);
        this.add(slider3);
        slider3.setBorder(BorderFactory.createTitledBorder(""));
        slider3.setMajorTickSpacing(20);
        slider3.setMinorTickSpacing(5);
        slider3.setPaintTicks(true);
        slider3.setPaintLabels(false);
        this.add(lc3);
        this.add(new JLabel(""));
        this.add(new JLabel("State:"));
        this.add(l2);
        this.add(lStartHh);       //text field start light
        this.add(lStartMm);
        this.add(lc1);
        this.add(lc6); //ok
        this.add(l3);
        this.add(lEndHh);           //text field end light
        this.add(lEndMm);
        this.add(lc2);
        this.add(lc4); //ok
        this.add(l4);
        this.add(lc5);
        this.add(new JLabel(""));
        lcc.addActionListener(new TestActionListener());
        this.add(lcc);
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lc3.setText(String.valueOf(slider3.getValue()) + "%");
            }
        });
        this.setPreferredSize(new Dimension(570, 260));

    }
    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss", Locale.US);
            lc1.setText(lStartHh.getText()+":"+lStartMm.getText());
            lc2.setText(lEndHh.getText()+":"+lEndMm.getText());
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.set(Calendar.HOUR_OF_DAY,Integer.parseInt(lStartHh.getText()));
            cal1.set(Calendar.MINUTE, Integer.parseInt(lStartMm.getText()));
            cal2.set(Calendar.HOUR_OF_DAY,Integer.parseInt(lEndHh.getText()));
            cal2.set(Calendar.MINUTE,Integer.parseInt(lEndMm.getText()));
            java.util.Timer timer = new java.util.Timer();
            TimerTask task1 = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Light on");
                }
            }      ;
            TimerTask task2 = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Light off");
                }
            }   ;
            timer.schedule(task1, cal1.getTime(),86400*1000);
            timer.schedule(task2, cal2.getTime(),86400*1000);


}}}
