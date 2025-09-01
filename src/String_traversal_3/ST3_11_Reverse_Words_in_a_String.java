package String_traversal_3;

import java.util.Scanner;

public class ST3_11_Reverse_Words_in_a_String 
{
	 static String revers(String s)
		{
			 char[] ch=s.toCharArray();
			 int i=0;
			 int j=ch.length-1;
			 
			 while(i<j)
			 {
				 char temp=ch[i];
				 ch[i]=ch[j];
				 ch[j]=temp;
				 i++;
				 j--;
			 }
			 return new String(ch);
		}
	 
//	 static String revers(String s)
//	 {
//		 String t="";
//		 
//		 for(int i=s.length()-1;i>=0;i--)
//		 {
//			 t=t+s.charAt(i);
//		 }
//		 
//		 return t;
//		 
//	 }
	 
	 
		
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
	 
//	 static int wordcount(String s)
//	 {
//		 int count=0;
//		 for(int i=0;i<s.length();i++)
//		 {
//			 if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
//			 {
//				 count++;
//			 }
//			 
//		 }
//		 return s.charAt(0)==' '? count : count+1;
//	 }
		
		
		
		
		static String[] splite(String s)
		{
			int wordCount=wordcount(s);
			String[] ar=new String[wordCount];
			
			int j=0;
			String t="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					t=t+s.charAt(i);
				}
				else if(t.length()>0)
				{
					ar[j]=t;
					j++;
					t="";
				}
			}
			ar[j]=t;
			return ar;
			
		}

		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			
			String s=scan.nextLine();
			
			 String[] res=splite(s);
			 
			 
			 for(int i=0;i<res.length;i++)
			 {
				 System.out.print( revers(res[i])+" ");
			 }
			 System.out.println();
			 	 
				   
		} 
}
