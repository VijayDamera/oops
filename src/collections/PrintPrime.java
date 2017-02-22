/**
 * 
 */
package collections;

import java.util.Scanner;

/**
 * @author vd030897
 * Print Prime numbers from 1 to n
 */
public class PrintPrime {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Enter the number till which you want to print primes");
        int limit = new Scanner(System.in).nextInt();

        // Printing prime numbers till the list 
        for(int number=2; number<=limit; number++){
            if(isPrime(number)){
                System.out.println(number);
            }
        }
        
        /*
        //Other way to print primes of 1 to 50
        int num=50;
        int count=0;

        for(int i=2;i<=num;i++){
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }

            if(count==0){
                System.out.println(i);
            }
        }*/

    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}