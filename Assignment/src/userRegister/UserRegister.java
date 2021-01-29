package userRegister;

import java.util.Arrays;
import java.util.Scanner;

public class UserRegister {
    int a=1,b=2,c=3,d=4,e=5;

    //String[] nameLetter;

    public static char getLetter(String nameLetter,int index){
        return nameLetter.charAt(index);
    }

    public static void main(String[] args) {
        try{
            int total=0;
            System.out.println("Enter a Name:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            for (int i=0; i<name.length();i++){
                char nameLetter = getLetter(name,i);
                //System.out.print(nameLetter);
                total= total+nameLetter;
            }
            System.out.println(total);
        }catch(Exception e){
            System.out.println("Exception is : "+e);
        }
    }
}
