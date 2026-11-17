import java.util.Scanner;
public class Tas2 {
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
        System.out.print(v);
    }
}
