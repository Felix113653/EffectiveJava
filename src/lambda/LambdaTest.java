package lambda;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/19 17:23
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-19
 */
public class LambdaTest {
    public static void main(String[] args) {
        var planets = new String[]{"Mercury", "Venus", "Earth", "Mars"
                , "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println((Arrays.toString(planets)));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000,event ->
                System.out.println("The time is " + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }

}
