
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

 
    public static void main(String[] args) {
         char c;      
        Scanner scr=new Scanner(System.in);
        c=scr.nextLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("it is vowel");
        }
       
        else
        {
            System.out.println("it is consonant");
        }   
}
}

