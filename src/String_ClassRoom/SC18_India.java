package String_ClassRoom;

import java.util.Scanner;

public class SC18_India 
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
		 
		 
		 // india is my country
		 for(int i=0;i<res.length;i++)
		 {
			 System.out.print(res[i]+" ");
		 }
		 System.out.println();
		 
		 //reverse evry words
		 for(int i=0;i<res.length;i++)
		 {
			 System.out.print( revers(res[i])+" ");
		 }
		 System.out.println();
		 
		 
		 
		// country my is india
		 for(int i=res.length-1;i>=0;i--)
		 {
			 System.out.print(res[i]+" ");
		 }
		 System.out.println();
		 
		 // revers county is my india
		 for(int i=res.length-1;i>=0;i--)
		 {
			 System.out.print( revers(res[i])+" ");
		 }
		 System.out.println();
		
		 //count charactr prsent in string like inida5
		 for(int i=0;i<res.length;i++)
		 {
			 System.out.print(res[i]+res[i].length()+" ");
		 }
		 System.out.println();
		 
		 
		 // is india country my
		 for(int i=0;i<res.length;i=i+2)
		 {
			 System.out.print(res[i+1]+" "+res[i]+" ");
		 }
		 System.out.println();
		 
		 //country india my is
		 for(int i=0,j=res.length-1;  i<j;   i++,j--)
		 {
		 
			 System.out.print(res[j]+" "+res[i]+" ");
		 }
		 System.out.println();
		 
		 // reverse country india my is
		 for(int i=0,j=res.length-1;  i<j;   i++,j--)
		 {
			 System.out.print(revers(res[j])+" "+res[i]+" ");
		 }
		 System.out.println();
		 
		  
		 
	}

}
