import java.util.Scanner;
public class Tasa4 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int v=1;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c==' ') {
                v++;
            }
        }
        System.out.print(v);
    }
}
import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int v=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                v++;
            }
        }
        System.out.print("There are "+v+" digits");
    }
}
