package codewithShayan;

import java.util.Scanner;
public class PrimeNumber {
    int x = 0;

    public Boolean isPrime(int a){
        if ( a==1 || a==0){
            return false;
        } else{
            for (int i = 2; i<= a/2; i++ ){
                if (a%i == 0){
                    x = 1;
                    break;
                }
            }
            return x == 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var number = new PrimeNumber();
        System.out.print("Enter a number: ");
        Boolean result = number.isPrime(input.nextInt());
        System.out.println(result);
    }
}
