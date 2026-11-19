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
import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int sum=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else{
                if(num>0){
                    sum+=num;
                    System.out.print(num+"+");
                    num=0;
                }
            }
        }
        if(num>0){
            sum+=num;
            System.out.print(num);
        }
        System.out.println("="+sum);
    }
}
import java.util.Scanner;
public class Task3 {
    public static boolean isLower(char c) {
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
           return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int c = 0;
        for (int i = 0; i < t.length(); i++) {
            char ca = t.charAt(i);
            if (Character.isLetter(ca) && !isLower(ca)) {
                c++;
            }
        }
        System.out.print(c);
    }
}
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "Many developers love Python because Python is powerful.";
        String updatedText = text.replaceAll("Python", "Java");
        System.out.println(updatedText);
    }
}
