package equals;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/16 13:39
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import java.time.LocalDate;
import java.util.Objects;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-16
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireday = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        var other = (Employee) otherObject;
        return Objects.equals(name, other.name)
                && salary == other.salary && Objects.equals(hireday, other.hireday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireday);
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireday=" + hireday + "]";
    }
}
