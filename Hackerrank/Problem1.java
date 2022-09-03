import java.util.Scanner;
import java.util.*;

public class Problem1 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        for (int i =0; i<3; i++){
            str.add(sc.nextLine());
        }
        System.out.println("================================");
        for(int i=0;i<str.size();i++)
        {
            String str1 = str.get(i).split(" ")[0];
            String str2 = str.get(i).split(" ")[1];

            int strTool = 15 - str1.length();
            if (str2.length() == 2)
                str2 = "0" + str2;
            else if (str2.length() == 1) {
                str2 = "00" + str2;
            }


            System.out.println(str1 + repeat(strTool, " " ) + str2);
        }
        System.out.println("================================");

    }

    public static String repeat(int count, String str){
        return new String(new char[count]).replace("\0", str);
    }

}



//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Enter a word: ");
//            list.add(input.nextLine());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).split(" ")[0] + "          " + list.get(i).split(" ")[1]);
//        }
//    }
//}