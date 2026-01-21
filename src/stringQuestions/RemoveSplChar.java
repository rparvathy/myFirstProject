//remove all special characters ,remove all white space
package stringQuestions;
import java.util.Scanner;

public class RemoveSplChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1 = sc.nextLine();
        //System.out.println(str1.replaceAll("\\d",""));//removes digit
        //System.out.println(str1.replaceAll("[a-zA-Z]",""));//removes alphabets
        System.out.println(str1.replaceAll("\\s",""));//removes space
        //System.out.println(str1.replaceAll("\\W",""));
       // System.out.println(str1.replaceAll("\\w",""));//removes letter,digits,space
        //System.out.println(str1.replaceAll("[^a-zA-Z0-9 ]","")); //removes special characters
    }
}
