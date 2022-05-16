package arrayList;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/16 13:55
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import equals.Employee;

import java.util.ArrayList;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-16
 */
public class ArrayListTest {
    public static void main(String[] args) {
        var staff = new ArrayList<Employee>(5);

        staff.add(new Employee("Cral Cracker",75000,1987,12,15));
        staff.add(new Employee("Harry Hacker",50000,1990,10,1));
        staff.add(new Employee("Tony Tester",40000,1990,3,15));
        for(Employee e :staff){
            e.raiseSalary(5);
        }
        for (Employee e : staff){
            System.out.println("name = " + e.getName() + " salary = " + e.getSalary());
        }
    }
}
