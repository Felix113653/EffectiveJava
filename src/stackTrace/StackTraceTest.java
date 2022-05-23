package stackTrace;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/23 15:03
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import java.util.Scanner;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0
 * @date 2022-05-23
 */
public class StackTraceTest {
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        var walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if ( n<=1) r = 1;
        else r = n* factorial(n -1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }
}
