package W15;
public class W15_02_method_calculator {
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
     //รับค่าคีบอล
   
    public static void main(String[] args) {
        // 1) Method สำหรับบวกเลข
        plus(15, 15);

        // 2) Method สำหรับลบเลข
         mjnus(5, 100);

        // 3) Method สำหรับคูณเลข
         miltply(2, 10);

        // 4) Method สำหรับหารเลข
         djvide(5, 55);
    }
}
