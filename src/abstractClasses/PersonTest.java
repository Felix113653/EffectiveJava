package abstractClasses;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/13 16:31
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-13
 */
public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];
        people[0] = new Employee("Harry Hacker", 50000,1989,10,1);
        people[1] = new Student("Maria Morris", "computer science");
        for (Person p : people){
            System.out.println(p.getName()+", " + p.getDescription());
        }
    }
}
