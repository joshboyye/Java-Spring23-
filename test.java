

import java.util.*;
public class test {
    public static void main(String args[]){
        Scanner n= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input =n.nextLine();
        
        test obj = new test();

        obj.showInputDialog(input);



    }

        public static void showInputDialog(String str){
            int u=0;
            int l =0;
            String s ="Stop";
        for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);
                if(str.equalsIgnoreCase(s)){
                    break;
                }
                
                
            if(ch>='E' && ch<='E'){
                u++;
                System.out.println("number of lower case e's:"+ l);
            }
            if(ch>='e'&&ch<='e')
                    l++;
        }
            System.out.println("number of lower case e's:"+ l);
            System.out.println("number of Upper case e's:"+ u);    
    }
}
