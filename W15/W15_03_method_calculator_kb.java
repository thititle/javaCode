package W15;

import java.util.Scanner;

public class W15_03_method_calculator_kb {
     // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
     static int plus(int a, int b){
        System.out.println(a + "+" + b + "= "+(a+b));
        return a + b;

    }
    // 2) Method สำหรับลบเลข
      static int mjnus(int a, int b){
        System.out.println(a + "-" + b + "= "+(a-b));
        return a - b;
    }

    // 3) Method สำหรับคูณเลข
       static int miltply(int a, int b){
        System.out.println(a + "*" + b + "= "+(a*b));
        return a * b;
    }

    // 4) Method สำหรับหารเลข
       static int djvide(int a, int b){
        System.out.println(a + "/" + b + "= "+(a/b));
        return a / b;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("ป้อนตัวเลขที่ 1: ");
      int a = sc.nextInt();
       System.out.print("ป้อนตัวเลขที่ 2: ");
      int b = sc.nextInt();
        //  รับค่าจากคีย์บอร์ดก่อนส่งไปยัง method อื่น


        // 1) Method สำหรับบวกเลข
        plus(a,b);

        // 2) Method สำหรับลบเลข
        mjnus(a, b);

        // 3) Method สำหรับคูณเลข
        mjnus(a, b);

        // 4) Method สำหรับหารเลข
        djvide(a, b);
        
        
    }
}
