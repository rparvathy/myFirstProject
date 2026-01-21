package stringQuestions;

import java.util.StringTokenizer;

public class StringTokenizerSplit {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("Hello_World","_");
        System.out.println(str.nextToken());
        System.out.println("After splitting");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
