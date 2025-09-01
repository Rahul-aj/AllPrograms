package String_traversal_2;

import java.util.Scanner;

public class ST2_26_Sum_of_Digits_and_Concatenate
{
	 static void Sum_of_Digits_and_Concatenate(String s)
	    {
	        int sum=0;
	        String t="";
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(ch>='0' && ch<='9')
	            {
	            	int x=Character.getNumericValue(ch);
	                sum=sum+x;
	            }
	            else
	            {
	                t=t+ch;
	            }
	        }
	        System.out.print(t+sum);
	    }

	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        String s=scan.nextLine();

	        Sum_of_Digits_and_Concatenate(s);
	    }
}
