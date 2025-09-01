package String_traversal_1;

import java.util.Scanner;

public class ST1_09_Character_Printer 
{
	 static void  Character_Printer(String s)
     {
        boolean found=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(   (ch>='A' && ch<='Z')   ||    (ch>='a' && ch<='z')   )
            {
                System.out.print(ch+" ");
                found=true;
            } 
        }
        if(found==false)
        {
            System.out.println("No valid characters found.");
        }

     }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();

        Character_Printer(s);
      
    }
}
