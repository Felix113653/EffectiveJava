package enums;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/16 16:06
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import java.util.Scanner;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-16
 */
public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size is: " + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the_.");
        }
    }

    enum Size {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        private final String abbreviation;
    }
}
