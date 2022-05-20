package anonymousInnerClass;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/20 15:57
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0
 * @date 2022-05-20
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
class TalkingClock{
    public void start(int interval, boolean beep) {
    var listener = new ActionListener(){
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        if(beep) Toolkit.getDefaultToolkit().beep();
        }
    };
    var timer = new Timer(interval, listener);
    timer.start();
    }
}
