package FirstSample;/* Created with IntelliJ IDEA Ultimate Edition 2021.3.2
 * @author： 君临者
 * @date： 2022/04/29 15:33
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 * @version: 1.0
 */

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 */
public class LotteryOdds {
    public static void main(String[] args) {
        BigDecimal total = new BigDecimal(0.1);

        System.out.println(total);
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
