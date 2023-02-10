package project0;
import java.util.Scanner;

public class hello {
    public static void main (String[] args){

        Scanner s= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input =s.nextLine();

        int u=0;
        int l=0;

        for (int k = 0; k < input.length(); k++) {
        /**
         * The methods isUpperCase(char ch) and isLowerCase(char ch) of the Character
         * class are static so we use the Class.method() format; the charAt(int index)
         * method of the String class is an instance method, so the instance, which,
         * in this case, is the variable `input`, needs to be used to call the method.
         **/
        // Check for uppercase letters.
        if (Character.isUpperCase(input.charAt(k))) u++;
            
        // Check for lowercase letters.
        if (Character.isLowerCase(input.charAt(k))) l++;
    }
    
    System.out.printf("There are %d uppercase letters and %d lowercase letters.",u,l);
    }
}
