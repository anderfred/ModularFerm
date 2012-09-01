package fredx;
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import static java.lang.Thread.sleep;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 8/30/12
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Init {
    public static void main(String[] args) throws InterruptedException, ParseException {
        /*Ferm ferm1 = new Ferm("MyNewFerm");
        StatusForm f =new StatusForm();
        while (true){
        f.lightSt.setText(ferm1.Light());
        f.rainSt.setText(ferm1.Rain());
        f.statLight.setText(""+Ferm.LIGHT_CYCLE/1000+" sec");
        f.statRain.setText(""+Ferm.RAIN_CYCLE/1000+" sec");
        f.date1.setText(""+new Date());

        sleep(1000);
        } */
        Ferm ferm1 = new Ferm("MyNewFerm");
        TabbedStatusForm tF= new TabbedStatusForm();
        SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss" , Locale.US);
        while (true){
            //tF.lightSt.setText(ferm1.Light());
           // tF.rainSt.setText(ferm1.Rain());
           // tF.statLight.setText(""+Ferm.LIGHT_CYCLE/1000+" sec");
            //tF.statRain.setText(""+Ferm.RAIN_CYCLE/1000+" sec");
            tF.lc5.setText(""+sm.format(new Date()));
           if(ferm1.Light()){tF.lc3.setText("On");tF.lc4.setText("");}else {tF.lc3.setText("");tF.lc4.setText("Off");}
           sleep(1000);
        }
        //Date d = new Date();
        //SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss");
        //System.out.println(d.getTime());

        //sm.format(sm.parse(new String("14:50:12")));
        //System.out.print(sm.parse(new String("14:50:12")));
    }


}
