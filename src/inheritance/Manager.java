package inheritance;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/08 19:58
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-08
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return super.getSalary() + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
