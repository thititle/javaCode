package Test_674230015;

import java.util.Scanner;

public class S674230015_01_myTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("กรุณาใส่จำนวนเต็ม : ");
        int number = sc.nextInt();
        if(number %2 != 0){
            System.out.println("ตัวเลข "+ number +"เป็นจำนวนบวก");
        }
    
    }
}
