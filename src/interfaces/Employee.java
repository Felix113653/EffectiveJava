package interfaces;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/17 16:21
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-17
 */
public class Employee implements Comparable<Employee> {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public final int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }


}
