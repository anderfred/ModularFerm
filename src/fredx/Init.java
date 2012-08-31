package fredx;

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
    public static void main(String[] args) throws InterruptedException {
        Ferm ferm1 = new Ferm("MyNewFerm");
        StatusForm f =new StatusForm();
        while (true){
        f.lightSt.setText(ferm1.Light());
        f.rainSt.setText(ferm1.Rain());
        f.statLight.setText(""+Ferm.LIGHT_CYCLE/1000+" sec");
        f.statRain.setText(""+Ferm.RAIN_CYCLE/1000+" sec");
        f.date1.setText(""+new Date());

        sleep(1000);
        }
    }


}
