package String_traversal_2;

import java.util.Scanner;

public class ST2_24_String_to_ASCII_Converter 
{
	static void String_to_ASCII_Converter(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int a=ch;
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

       String_to_ASCII_Converter(s);
    }
}
