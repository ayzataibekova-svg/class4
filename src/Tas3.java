import java.util.Scanner;
public class Tas3 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int v=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                v++;
            }
        }
        System.out.print(v);
    }
}
