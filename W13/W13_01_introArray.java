package W13;

public class W13_01_introArray {
  public static void main(String [] args){
    // ประกาศตัวแปรชนิด Array แบบที่ 1 รู้จำนวนข้อมมูลล้วงหน้า
     String[]colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};
     int[]bank = {20,50,100,500,1000};
     char[]Alphabets = {'A','B','C','D','E'};

    // แสดงผลลัพธ์โดยใช้ index ของ Array
     System.out.println("The first colors is " + colors[0]);
     System.out.println("The Third Alphabets is " + Alphabets[2]);

    //  แสดงผลลัพธ์โดยใช้ Loop
    System.out.println("================================");
    System.out.print("Colors in the array are : ");
    for(int i=0; i < 7 ; i++ ) {
        System.out.print(colors[i]+" ");
    }
    System.out.println();
    System.out.println("================================");
     for(int i=6; i > 0   ; i-- ) {
        System.out.print(colors[i]+" ");
    }
    System.out.println("================================");
    System.out.print("bank in the array are :");
     for(int i=0; i < bank.length ; i++ ) {  //ใช้.length ในการหาขนาดของ Array 
        System.out.print(bank[i]+" ");
    }

  }
}