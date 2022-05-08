package ParamTest;/* Created with IntelliJ IDEA Ultimate Edition 2021.3.2
 * @author： 君临者
 * @date： 2022/05/07 17:00
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 * @version: 1.0
 */


/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);
        System.out.println("\nTesting tripleValue2:");
        var harry = new Employee("Harry", 50000);
        System.out.println("Before: harry=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: harry=" + harry.getSalary());
        System.out.println("\nTesting swap:");
        var a = new Employee("Alice ", 70000);
        var b = new Employee("Bob ", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before：" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3*x;
        System.out.println("End of method: x = " + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x =y ;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}
class Employee
{
    private final String name;
    private double salary;
    public Employee(String n ,double s){
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary +=raise;
    }
}
