package fredx;
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

import javax.swing.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 8/30/12
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Init {
    public static JTextArea lOG = new JTextArea(20,20);
    public static JLabel TIME = new JLabel("");
    public static boolean IS_LIGHT;
    public static Date NEXT_Aeroponic;
    public static void main(String[] args) throws InterruptedException, ParseException {

        Ferm ferm1 = new Ferm("MyNewFerm");
        TabbedStatusForm tF= new TabbedStatusForm();
        final SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss" , Locale.US);
        java.util.Timer timer = new java.util.Timer();
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                TIME.setText(sm.format(new Date()));
            }
        }       ;
        timer.schedule(t,new Date(),1000);
    }


}
