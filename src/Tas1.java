import java.util.Scanner;
public class Tas1 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String t=in.nextLine();
        String newt="";
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            }
            else if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}
