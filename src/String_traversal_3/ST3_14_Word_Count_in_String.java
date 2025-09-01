package String_traversal_3;

import java.util.Scanner;

public class ST3_14_Word_Count_in_String 
{
	 static int wordcount(String s)
		{
			int count=0;
			char [] ch=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				 
				if( ch[i]==' ' && ch[i+1]!=' ')
				{
					count++;
				}
			}
			return ch[0]==' '? count:count+1;
		}

	    public static void main(String[] args)
	     {
	        Scanner scan = new Scanner(System.in);
	        String s= scan.nextLine();

	       int res= wordcount(s);
	       System.out.print(res);
	       
	    }
}
