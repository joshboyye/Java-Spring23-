package project0;

import java.util.*;
public class test {
    public static void main(String args[]){
        int u=0;
        int lower =0;
        Scanner n= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input =n.nextLine();

        for(int i=0; i<input.length(); i++){
            char ch= input.charAt(i);
            if(ch>='E' && ch<='E')
                u++;
            if(ch>='e'&&ch<='e')
                lower++;

    }
        System.out.println("number of lower case e's:"+ lower);
        System.out.println("number of Upper case e's:"+ u);

    //IDK how to use this in the main class 
    /*public static void showInputDialog(String str){
        int u=0;
        int l =0;
        
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch>='E' && ch<='E')
                u++;
            if(ch>='e'&&ch<='e')
                l++;
    }*/
        
    }
}
