package project0;

import javax.swing.*;
import java.util.*;
public class test {
    public static void main(String args[]){
        test obj = new test();
        Scanner n= new Scanner(System.in);
        String input =n.nextLine();

        obj.showInputDialog(input);



    }

        public static void showInputDialog(String str){
            int u=0;
            int l =0;
            String a="";
        while(true){
            a = JOptionPane.showInputDialog(null,"Please enter a sentence:");
            if(str.equalsIgnoreCase("STOP")){
                break;
            }
            for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);
                if(ch>='E' && ch<='E'){
                    u++;
                }
                if(ch>='e'&&ch<='e'){
                l++;
            }
        }
    }
    JOptionPane.showMessageDialog(null, "Number of Upper \"E\" is "+u+"\n"+"Number of Lower \"e\" is "+l);
}
}
