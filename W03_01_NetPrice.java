public class W03_01_NetPrice{
 public static void main(String[] args) {
         
    short price = 350;
    byte quantity = 10;
    byte percentDiscount = 5;

    int totalPrice = price * quantity;

    int discount = totalPrice * percentDiscount / 100;

    int netprice = totalPrice - discount;

    System.out.println("Total product price = " + totalPrice + " baht");
    System.out.println("Personal price = " + discount+ " baht");
    System.out.println("Net price = " + netprice + " baht");

    }
}