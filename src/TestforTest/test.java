package TestforTest;
/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/27 13:23
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */
import java.util.Scanner;

/**
 * @author Feyncode
 * @version 1.0
 * @date 2022-05-27
 */
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要求的哪一年工资：");
        int n = input.nextInt();
        //方法一：递推（迭代）
        int salary = 1500;
        for (int i = 1; i < n; i++) {
            salary *= 1.1;
        }
        System.out.println("第" + n + "年的工资为：" + salary);
        System.out.println("第" + n + "年的工资为：" + Salary(n));
    }

    //方法二：递归
    public static int Salary(int n) {
        if (n == 1) {
            return 1500;
        } else {
            return (int) (Salary(n - 1) * 1.1);
        }
    }
}
