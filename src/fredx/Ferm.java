package fredx;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public static Date LIGHT_START;
    public static Date LIGHT_END;
    public static int RAIN_CYCLE;
    SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss");
    boolean semLight;
    int semL;
    float temperature;
    public Ferm(String name){
          this.name=name;
          this.date=new Date();
        //LIGHT_CYCLE=5000;
        RAIN_CYCLE=5000;
    }


    public boolean Light() throws ParseException {
        Date tDate = new Date();
        tDate=sm.parse(new String(sm.format(tDate)));
        System.out.println(tDate);
        //Boolean state=false;
        if ((LIGHT_END==null) || (LIGHT_START==null)){System.out.println("Enter if null");}
        else if (state==false){
              if ((LIGHT_START.getTime()+3000>=tDate.getTime())&&((LIGHT_START.getTime()-3000<=tDate.getTime()))){
               state = true;
                  //light.on();
                  System.out.print("Light on\n");
                  return true;
            }
        }
        else {if ((LIGHT_END.getTime()+3000>=tDate.getTime())&&((LIGHT_END.getTime()-3000<=tDate.getTime())))
        {
            state = false;
            //light.off();
            System.out.print("Light off\n");
            return false;
        }
        }
        return false;
    }


    public String Rain(){
        String res;
        if (rain==null){rain = new Date(); res="Rain on \\"+RAIN_CYCLE/1000;}
        else if((new Date().getTime()-rain.getTime())>RAIN_CYCLE){
            res="Rain on \\"+RAIN_CYCLE/1000;
            rain=new Date();
        }
        else {res="Rain not needed \\"+RAIN_CYCLE/1000;}
        return res;
    }
}
