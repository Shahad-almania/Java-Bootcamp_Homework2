package Homework2;
/* Q2: Create method called " calculateTax " that takes price between 100 - 500
   and return the required tax for this price ( tax = price * 15/100 )
   It should exit if the price outside the given range
   answer:*/
public class EX2 {
    public static void main (String[] args) {

        int tax=calculateTax(100);
        int tax1=calculateTax(1000);
    }
    public static int calculateTax(int price ) {
        int pricetax = price * 15 / 100;

        if (price < 100 || price > 500) {
            System.out.println(pricetax+" price outside the given range.");

        } else if (price >= 100 && price <= 500) {
            System.out.println(pricetax+" tax price.");
        }
        return pricetax;

    }
}
