package W10;
import java.util.Scanner;
public class W10_04_titleStatus {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("ระบุเพศ (ชาย/หญิง):");
        String gender = kb.next();
        System.out.print("ระบุอายุ");
        int age = kb.nextInt();
        System.out.print("สถานะสมรส(single/married):");
        String isMarried = kb.next();


        if(gender.equalsIgnoreCase("male")){
        //  ถ้าเป็นผู้ชาย
        if(age < 15){
            System.out.print("ด.ช.");
        }else{
            System.out.print("ชาย");
        }
        }else{
        //  ถ้าเป็นผู้หญิง
        if(age < 15){
            System.out.print("ด.ญ.");
        }else if(isMarried.equalsIgnoreCase("single")){
            System.out.print("นาง");
        }else{
            System.out.print("นางสาว");
        }
        }


    }
}