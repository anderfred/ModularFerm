package fredx;
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
    public static int LIGHT_CYCLE;
    public static int RAIN_CYCLE;
    boolean semLight;
    int semL;
    float temperature;
    public Ferm(String name){
          this.name=name;
          this.date=new Date();
        LIGHT_CYCLE=5000;
        RAIN_CYCLE=5000;
    }


    public String Light() {
        String res;
             if (light==null){light = new Date(); res ="Light on \\"+LIGHT_CYCLE/1000;}
             else if((new Date().getTime()-light.getTime())>LIGHT_CYCLE){
             res="Light on \\"+LIGHT_CYCLE/1000;
             light=new Date();
             }
        else {res="Light is active \\"+LIGHT_CYCLE/1000;}
        return res;
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
