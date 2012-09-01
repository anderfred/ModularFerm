package fredx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 7/18/12
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatusForm extends JFrame {

    JButton button1 = new JButton("Apply");
    private JPanel panel1= new JPanel();
    private JButton button2Button= new JButton("2");
    private JButton a3Button= new JButton("3");
     JLabel lightSt = new JLabel("");
     JLabel rainSt = new JLabel("");
    JLabel date1 = new JLabel("");
    JLabel statRain = new JLabel(""+Ferm.RAIN_CYCLE/1000+" sec");
    //JLabel statLight = new JLabel(""+Ferm.LIGHT_CYCLE/1000+" sec");
    JTextField rainNew = new JTextField();
    JTextField lightNew = new JTextField();
    private JButton buttons[]=new JButton[10];

    public StatusForm() {
        setTitle("Ferm Status Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.GREEN);
        setPreferredSize(new Dimension(100,100));
        setSize(600,100);
        setLocationRelativeTo(null);
        Container cont = getContentPane();
        cont.setLayout(new GridLayout(4,3));
        //cont.add(button1Button);
        //cont.add(button2Button);
        //cont.add(a3Button);
        cont.add(new JLabel("Type:"));
        cont.add(new JLabel("Cycle:"));
        cont.add(new JLabel("New value: sec"));
        cont.add(new JLabel("Now:"));
        cont.add(new JLabel("Light "));
       // cont.add(statLight);
        cont.add(lightNew);
        cont.add(lightSt);
        cont.add(new JLabel("Rain "));
        cont.add(statRain);
        cont.add(rainNew);
        cont.add(rainSt);
        cont.add(date1);
        cont.add(new JLabel(""));
        cont.add(button1);
        button1.addActionListener(new TestActionListener());
        setVisible(true);}

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Код, который нужно выполнить при нажатии
            //for(JButton b:buttons){if (e.getSource()==b){ddddLabel.setText(b.getText()); break;}}
         //   Ferm.LIGHT_CYCLE=1000*Integer.parseInt(lightNew.getText());
            Ferm.RAIN_CYCLE=1000*Integer.parseInt(rainNew.getText());
            //statLight=new JLabel(""+Ferm.LIGHT_CYCLE/1000+" sec");
            //statRain=new JLabel(""+Ferm.RAIN_CYCLE/1000+" sec");
        }
    }
}
