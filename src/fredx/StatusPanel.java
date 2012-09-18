package fredx;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimerTask;


/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 16.09.12
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 */
public class StatusPanel extends JPanel {
    java.util.Timer timer = new java.util.Timer();
    SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss", Locale.US);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    FlowLayout f = new FlowLayout(FlowLayout.LEFT);
    JLabel l1 = new JLabel("Light: ");
    JLabel l12 = new JLabel("");
    JLabel l13 = new JLabel("");
    JLabel l2 = new JLabel("Aeration");
    public static JLabel l22 = new JLabel("");
    public static JLabel l23 = new JLabel("");
    JLabel l24 = new JLabel();
    JLabel l3 = new JLabel("Temp");
    JLabel l4 = new JLabel("Present time:");

    Calendar cal3 ;
    public StatusPanel(){
        p1.setLayout(f);
        p1.add(l1);
        p1.add(l12);
        p1.add(l13);
        this.setLayout(new GridLayout(0, 1));
        this.add(p1);
        this.add(new JSeparator());
        p2.setLayout(f);
        p2.add(l2);
        p2.add(l22);
        p2.add(l23);
        this.add(p2);
        this.add(new JSeparator());
        TimerTask task2 = new TimerTask() {
            public void run() {
                if(Init.IS_LIGHT){l12.setText("On");}
                else if (!Init.IS_LIGHT){l12.setText("Off");}
                if(LightPanel.cal1!=null){
                       Calendar cale=Calendar.getInstance();
                       cal3 = Calendar.getInstance();
                        if(Init.IS_LIGHT){
                        cal3.setTime(new Date(LightPanel.cal2.getTimeInMillis()-cale.getTimeInMillis()));
                        cal3.roll(Calendar.HOUR_OF_DAY,-7);
                        l13.setText("  Turn off in: "+cal3.get(Calendar.HOUR_OF_DAY)+"h "+cal3.get(Calendar.MINUTE)+"m "+cal3.get(Calendar.SECOND)+"s");}
                    else if(!Init.IS_LIGHT){

                            cal3.setTime(new Date(LightPanel.cal1.getTimeInMillis()-cale.getTimeInMillis()));
                            cal3.roll(Calendar.HOUR_OF_DAY,-7);
                            l13.setText("  Turn on in: "+cal3.get(Calendar.HOUR_OF_DAY)+"h "+cal3.get(Calendar.MINUTE)+"m "+cal3.get(Calendar.SECOND)+"s");
                        }
                }
                else if (LightPanel.cal1==null){}
                if(!StatusPanel.l22.equals(new String(""))){
                       cal3 = Calendar.getInstance();
                       //l24.setText();
                }
            }
        }   ;
         timer.schedule(task2,new Date(),1000);
    }
}
