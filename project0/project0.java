package project0;
import java.util.Scanner;

public class project0 {
    public static void main(String args[]){
        Scanner n= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input =n.nextLine();
        
        showInputDialog(input);

    }
    public static void showInputDialog(String str){
        int u=0;
        int l =0;
        
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch>='E' && ch<='E')
                u++;
            if(ch>='e'&&ch<='e')
                l++;
    }
        
    }
}
