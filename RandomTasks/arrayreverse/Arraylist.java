package codewithShayan;

import java.util.Arrays;
import java.util.Scanner;


public class Arraylist {


    public void func(){
        System.out.println("create your first array");
        int[] array1 = getArray();
        System.out.println("create your second array");
        int[] array2 = getArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int a = convertArrayReverse(array1);
        System.out.println(a);

        int b = convertArrayReverse(array2);
        System.out.println(b);

        arraySum(a,b);
    }


    private int[] getArray(){
        var x = new Scanner(System.in);
        System.out.print("Enter the length of arraylist: ");
        int count = x.nextInt();
        int[] numbers = new int[count];
        for ( int i = 0; i < count; i++){
            System.out.print("Enter the elements: ");
            numbers[i] = x.nextInt();
        }
        return numbers;
    }

    private int convertArrayReverse(int[] array){
        String sum = "";
        for ( int i = array.length-1; i >= 0; i-- )
            sum += array[i];

        return Integer.parseInt(sum);
    }

    private void arraySum(int a, int b){
        int sum = a + b;
        String intToString = String.valueOf(sum);
        System.out.println("the sum string is: "+ intToString);
        int[] result = new int[intToString.length()];
        for ( int i = intToString.length()-1; i >= 0; i--)
            result[(intToString.length() - 1) - i] = intToString.charAt(i);
        System.out.println
                ("the reversed string is: " + Arrays.toString(result));
    }
}
