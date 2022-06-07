package Pravin;

public class Panagram 
{
	public static void main(String[] args) 
	{
		String s="bacndefghijklmopqrstuvwxyz";
		
		s=s.toLowerCase();
		
		String x="";
		for (int i = 0; i < s.length(); i++)
		{
			int cnt=0;
			for (int j = 0; j < i; j++) 
			{
				if(s.charAt(i)==s.charAt(j))
					cnt++;
			}
			if(cnt==0)
			{
				x+=s.charAt(i);
			}
		}
		int count=0;
		for (int i = 0; i < x.length(); i++)
		{
			if(x.charAt(i)>='a' && x.charAt(i)<='z')
				count++;
		}
		if(count==26)
			System.out.println("panagram");
		else
			System.out.println("not panagram");
	}
}
