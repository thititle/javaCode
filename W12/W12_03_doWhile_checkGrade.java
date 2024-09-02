package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int score;
        


                                           // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน                                 // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.err.println("Enter your score between i and 100: ");
              score = kb.nextInt();                        // แสดงข้อความให้ผู้ใช้ป้อนข้อมูล between 1 and 100:
                                           // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number
        } while (score < 1 && score >100);                        // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        
        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75

        // ตรวจสอบเกรด

        kb.close();
        if(score >= 80){
            System.out.println("your grade is A");
        }else if(score >= 70){
            System.out.println("your grade is B");
        }else if (score >=60){
            System.out.println("your grade is C");
        }else if (score >= 50){
            System.out.println("your grade is D");
        }else if (score >=0){
            System.out.println("your grade is E");
        }else if (score < 0){
            System.out.println("please enter a value between i and 100");
        }else{
            System.out.println("!!Enter!!");
        } // ปิด Scanner object
    }

}