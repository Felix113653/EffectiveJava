package equals;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/16 13:33
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import inheritance.Manager;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-16
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice Adam", 75000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adam", 75000, 1987, 12, 15);
        var bob = new Employee("Bob Brandson", 5000, 1989, 10, 1);
        System.out.println("alice1 ==alice2: " + (alice1 == alice2));
        System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
        System.out.println("alice1.equals(bob):" + alice1.equals(bob));
        System.out.println("bob.toString():" + bob);
        var carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss.toString():" + boss);
        System.out.println("carl.equals(boss):" + carl.equals(boss));
        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("carl.hashCode():" + carl.hashCode());
    }
}
