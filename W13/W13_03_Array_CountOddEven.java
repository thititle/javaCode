package W13;

public class W13_03_Array_CountOddEven {
   public static void main(String[] args) {
    //ให้นับเลยคู่และเลขคี่ใน Array ด้านล้าง
    int [] numbers = {1,5,6,7,9,12,25,26,30,44,48,12,36,51,53,55,88,20,11,21};
    int countOdd = 0;
    int countEven = 0;
    for (int i = 0; i<numbers.length; i++) {
        System.out.print(numbers[i] + " ");
        if(numbers[i] % 2 == 0){
            countEven++;
        }else{
            countOdd++;
        }
    }
        System.out.println("\n Amount of all Numbers : " + numbers.length);
        System.out.println("\n Amount of Odd Numbers : " + countOdd);
        System.out.println("\n Amount of Even Numbers : " + countEven);
   }
}
