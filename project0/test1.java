
import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        Scanner n= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input =n.nextLine();
        
        project0 obj = new project0();

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
            
            
            else if(ch>='E' && ch<='E'){
                u++;
                System.out.println("number of lower case e's:"+ l);

            }

            else if(ch>='e'&&ch<='e')
                l++;
                System.out.println("number of Upper case e's:"+ u);


           
    }
        // System.out.println("number of lower case e's:"+ l);
        // System.out.println("number of Upper case e's:"+ u);
        
    }
}
