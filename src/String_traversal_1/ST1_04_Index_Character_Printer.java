package String_traversal_1;

import java.util.Scanner;

public class ST1_04_Index_Character_Printer 
{
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int x=scan.nextInt();

        for(int i=0;i<s.length();i++)
        {
            if(i==x)
            {
                System.out.println(s.charAt(i));
            }
        }
        if(x>=s.length())
        {
            System.out.println("Invalid index");
        }
       
    }
}
