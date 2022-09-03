package codewithShayan;

import java.util.Scanner;

public class Palindrome {

    public void isPalindrome(){
        String a = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter your value: ");
        String b = input.nextLine();
        int len = b.length();
        for (int i = len-1; i >= 0; i--)
            a += b.charAt(i);
        if ( a.equals(b))
            System.out.println("is palindrome");
        else
            System.out.println("is not palindrome");
    }

    public static void main(String[] args) {
        var str = new Palindrome();
        str.isPalindrome();
    }

}
