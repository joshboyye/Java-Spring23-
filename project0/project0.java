import javax.swing.*;

public class project0 {
    public static void main(String[]args){



    String a="";
    while(true){
    a = JOptionPane.showInputDialog(null,"Please enter a sentence:");
    if(a.equalsIgnoreCase("STOP")){
        break;
    }
    int u=0;
    int l =0;
    for(int i=0; i<a.length(); i++){
        char ch= a.charAt(i);
        if(ch>='E' && ch<='E'){
            u++;
        }
        if(ch>='e'&&ch<='e'){
        l++;
                }
            }
            JOptionPane.showMessageDialog(null, "Number of Upper \"E\" is "+u+"\n"+"Number of Lower \"e\" is "+l);
        }
    }
}   

