package ConstructorTest;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/08 10:45
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */


import java.util.Random;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-08
 */
public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry",4000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
        for (Employee e:staff) {
            System.out.println("name ="+  e.getName() +",id="+ e.getId() +",salary="+ e.getSalary());
        }
    }
}
class Employee {
    private static int nextId;
    private int id;
    private String name = "";
    private double salary;
    static{
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }
    public Employee(String n ,double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #"+ nextId,s);
    }

    public Employee() {

    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
}

