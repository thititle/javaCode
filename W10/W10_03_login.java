package W10;
import java.util.Scanner;
public class W10_03_login {
    public static void main (String [] args) {
       String username = "hotdog";
       String password = "15988";

       Scanner kb = new Scanner(System.in);
    //สร้างตัวแปรเก็บ username และ passowrd ที่ผู้ใช้ป้อนเข้ามา
    System.out.print("ป้อนชื่อผู้ใช้: ");
    String inputUsername = kb.nextLine();

    System.out.print("ป้อนรหัสผ่าน:");
    String inputPassword = kb.nextLine();
    
    if(username.equals(inputUsername) && password.equals(inputPassword)){
        System.out.print("เข้าสู่ระบบสำเร็จ");
    }else{
       if(!username.equals(inputUsername) && password.equals(inputPassword)){
        System.out.print("ชื่อผู้ใช่ไม่ถูกต้อง");
       }else if(username.equals(inputUsername) && !password.equals(inputPassword)){
        System.out.print("รหัสผ่านไม่ถูกต้อง");
              
        }else{
        System.out.print("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
       }
       
    }

    }
}
