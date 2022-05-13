package abstractClasses;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/13 16:33
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-13
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
