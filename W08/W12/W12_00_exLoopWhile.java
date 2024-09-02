// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 

package W12;

public class W12_00_exLoopWhile {
    public static void main(String[] args) {
        
        // โครงสร้างคำสั่งลูป for/while แบ่งออกเป็น 3 ส่วน
        // 1. ส่วนตัวแปรเริ่มต้น
        // 2. เงื่อนไข
        // 3. การเพิ่มค่า / การลดค่า
        
        // TODO 1
        System.out.println("TODO 1-For Loop");
        for(int i=1 ; i<=5 ; i++ ){
            // คำสั่งที่เราต้องการให้ทำซ้ำ
           System.out.println("รอบที่ "+ i);
        }   
        System.out.println("------------------------------");
        // =============================TODO 1 : End For Loop======================================
        System.out.println("TODO 1-While Loop");
        int n1=1 ;
        while (n1<=5) { 
         System.out.println("รอบที่ "+ n1);
         n1++;
        }
        System.out.println("=======================");
        // =============================TODO 1 : End While Loop====================================






        // ======================================================================
        
        // คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
         // TODO 2
        // ===============
        // รอบที่ 1 Hello World
        // รอบที่ 2 Hello World
        // รอบที่ 3 Hello World
        // รอบที่ 4 Hello World
        // รอบที่ 5 Hello World
        
        System.out.println("TODO 2-For Loop");
        for(int i=1 ; i<=5 ; i++ ){
            // คำสั่งที่เราต้องการให้ทำซ้ำ
           System.out.println("รอบที่ "+i+" Hello World ");
        }   
        System.out.println("------------------------------");
        System.out.println("TODO 2-While Loop");
        int n2=1;
        while (n2<=5){
            System.err.println("รอบที่ " +n2+ "Hello World");
            n2++;
        }


        System.out.println("===================");

// ======================================================================

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// TODO 3
// ===============
// 1 2 3 4 5 6 7 8 9 10


      System.out.println("TODO 3-For Loop");
       for(int j=1;j<=10;j++){
        System.out.print(j+" ");
       } 
       System.out.println(" ");
       System.out.println("------------------------------");
    System.out.println("TODO 3-While Loop");
    int n3=1;
    while (n3<=10){
    System.out.print(n3 + " ");
         n3++;
       }
    System.out.println(" ");
    System.out.println("==============");
    
// ======================================================================


//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

// TODO 4

    System.out.println("TODO 4-For Loop");
    
     int sum =0;
       for(int j=1;j<=10;j++){
        System.out.print(j+" ");
        sum = sum+j; // sum += j;
        
       }
       System.out.print("= " + sum);
        System.out.println();
    System.out.println("------------------------------------");
    
    System.out.println("TODO 4-While Loop");
     int sum2=0;
     int n4 = 1;
      while (n4<=10){
        System.out.print(n4 + " ");
        sum2 += n4;
        n4++;
      }
      System.out.println("= " + sum2);
      
      System.out.print("================");
  




// ======================================================================

//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55

// TODO 5

  
    System.out.println("TODO 5 : For Loop");
   
    sum =0;
       for(int j=1;j<=10;j++){
        System.out.print(j);
        if(j <= 9){
            System.out.print("+");
        }
        sum = sum+j; // sum += j;
        
       }
       System.out.print(" = " + sum);
         System.out.println();
    System.out.println("------------------------------------");

    System.out.println("TODO 5-While Loop");

     sum = 0;
      int n5 = 1 ;
       while (n5<=10){
        System.out.print(n5);
        if(n5 <=9){
        System.out.print("+");
        }
         sum += n5;
         n5++;
       }
       System.out.println(" = " + sum);
       System.out.println("================");

// ======================================================================


//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1

// TODO 6
System.out.println("TODO 6-For Loop");
     System.out.println();
       for(int j=10;j>=1;j--){
        System.out.print(j + "  ");
       }
        System.out.println();
       System.out.print("------------------------------------");
     
       int n6 = 10;
       while (n6 >= 1){
         System.out.println(n6 + " ");
         n6--;
       }
       System.out.println("================");
// ======================================================================

//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19

// TODO 7

   System.out.println();
    for(int j=1;j<=19;j=j+2){
        System.out.print(j+ " ");
    }

// ======================================================================

//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20

// TODO 8
System.out.println("TODO 8 - For Loop");
    System.out.println();
    for(int j=2;j<=20;j=j+2){
        System.out.print(j+ " ");
    }
     System.out.println();
System.out.print("------------------------------------");
System.out.println();
   System.out.println("TODO 8 - While Loop");
   System.out.println();
    int n8 = 2;
    int time = 20;
    while (n8 <= time) {
        System.out.print(n8 +" ");
        n8 = n8 +2;
    }
    System.out.println("================");
// ======================================================================

//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100

// TODO 9 
System.out.println("TODO 9 - For Loop");
     System.out.println();
     int num = 1;
    for(int j=1;j<=100;j+=num+=2){
        System.out.print(j+ " ");
    }
    System.err.println("TODO 9 - While Loop");
    int n9 = 2;
    while (n9 <= 10){
        System.out.print(n9*n9+" ");
        n9+=2;
    }

// ======================================================================

//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่

// TODO 10
    System.out.println();
     
    for(int i=1;i<=5;i++){
        if(i%2==0){
         System.out.println("รอบที่ " +i+ "เลขคี่"); 
        }else{
         System.out.println("รอบที่ " +i+ "เลขคู่");
        }
       
        
       
       

// ======================================================================
    }
  }
}        