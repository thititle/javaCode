package Test_674230015;

import java.util.Scanner;

public class S674230015_03_myTest{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("กรุณาป้อนตัวเลข 4 ตัว : ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int num4 = sc.nextInt();
      if(num1 > num2 && num1 > num3 && num1 > num4 ){
        System.out.println("ค่าที่มากสุดคือ " + num1);
      }else if (num2 > num1 && num2 > num3 && num2 > num4 ){
        System.out.println("ค่าที่มากสุดคือ " + num2);
      }else if(num3 > num1 && num3 > num2 && num3 > num4 ){
        System.out.println("ค่าที่มากสุดคือ " + num3);
      }else if (num4 > num1 && num4 > num2 && num4 > num3){
        System.out.println("ค่าที่มากสุดคือ " + num4);
      }
    
    
    }
   
}