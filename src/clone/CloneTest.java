package clone;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/18 20:58
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */


/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-18
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        System.out.println("original = " + original);
        System.out.println("copy = " + copy);
    }
}
