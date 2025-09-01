package String_traversal_2;

import java.util.Scanner;

public class ST2_22_Space_Count_in_String 
{
	static int  Space_Count_in_String(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int res=Space_Count_in_String(s);
        System.out.println(res);
      
       
    }
}
