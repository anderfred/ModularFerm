package fredx;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: fredx
 * Date: 9/9/12
 * Time: 9:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class LogPanel extends JPanel {
    JScrollPane scroll = new JScrollPane(Init.lOG);
    public LogPanel(){
         this.setLayout(new GridLayout(0,1));
        this.add(scroll);

    }
}
