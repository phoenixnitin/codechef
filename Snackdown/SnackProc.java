import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SnackProc
{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int records = in.nextInt();
		int length;
		int counter=0;
		String str;
		for(int i=0;i<records;i++)
		{
			length = in.nextInt();
			str = in.next();
			char[] ch = str.toCharArray();
			counter = 0;
			for(int j=0;j<str.length();j++)
			{
				switch(ch[j]){
					case 'H':counter++;break;
					case 'T':counter--;break;
					case '.':break;
					default:counter=2;
				}
				if(counter<0 || counter>1)
				{
					System.out.println("Invalid");
					break;
				}
			}
			if(counter==0)
				System.out.println("Valid");
			else if(counter==1)
				System.out.println("Invalid");
		}
	}
}