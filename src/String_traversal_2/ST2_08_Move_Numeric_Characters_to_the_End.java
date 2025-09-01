package String_traversal_2;

import java.util.Scanner;

public class ST2_08_Move_Numeric_Characters_to_the_End
{
	static String  Lowercase_Character_Count(String s)
    {
        String t1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || ( ch>='A' && ch<='Z'))
            {
                t1=t1+ch;
            }
        }

        String t2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='0' && ch<='9')  )
            {
                t2=t2+ch;
            }
        }

        return t1+t2;
    }

    public static void main(String[] args)
    { 
        Scanner scan=new Scanner(System.in); 
		String s=scan.nextLine();

       String res= Lowercase_Character_Count(s);
       System.out.println(res);
    }
}
