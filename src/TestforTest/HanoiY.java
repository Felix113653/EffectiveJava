package TestforTest;

/* Created with IntelliJ IDEA Ultimate
 * @date： 2022/06/13 17:39
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */
public class HanoiY {
    void Move(char chSour, char chDest) {
        System.out.println("Move the top plate of" + chSour + " to " + chDest);
    }

    void Hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            Move(a, c);
        } else {
            Hanoi(n - 1, a, c, b);
            this.Move(a, c);
            Hanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        HanoiY hanoi = new HanoiY();
        hanoi.Hanoi(n, 'a', 'b', 'c');
    }
}
