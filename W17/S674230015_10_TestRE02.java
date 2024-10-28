package W17;

import java.util.Scanner;

public class S674230015_10_TestRE02 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("ตรวจสอบว่าเป็นเต็มลบและเต็มบวก: ");
        int number = kb.nextInt();
        int result = number % 2;
        if (result > 0) {
            System.out.print(number + " เต็มบวก");
        } else {
            System.out.print(number + " เต็มลบ");
        }
    }
}
