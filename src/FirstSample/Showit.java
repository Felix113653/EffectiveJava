package FirstSample;/* Created with IntelliJ IDEA Ultimate Edition 2021.3.2
 * @author： 君临者
 * @date： 2022/05/05 17:51
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 * @version: 1.0
 */

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 */
public class Showit {
    public static void main(String[] args) {
        String str = "奇数为";
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(str + i);
            }
        }
    }
}
