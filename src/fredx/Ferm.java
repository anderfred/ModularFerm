package fredx;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 8/30/12
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ferm {
    String name;
    Date date;
    Date light;
    Date rain;
    public static boolean state = false;
    SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss");
    boolean semLight;
    int semL;
    float temperature;
    public Ferm(String name){
          this.name=name;
          this.date=new Date();
    }
}
