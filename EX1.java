package Homework2;
/* Q1:Create method called " primeNumber  " that takes number and check if it's prime or not
  If the number is prime it should return " Prime number " otherwise is should return " Not prime number "
     answer:*/
public class EX1 {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String args[]) {
        if (isPrime(3))
            System.out.println(" True the number is prime");
        else
            System.out.println(" False not prime number");

        if (isPrime(4))
            System.out.println(" True the number is prime");
        else
            System.out.println(" False not prime number");
    }


}
