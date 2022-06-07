package Pravin;

public class Array 
{
	public static void main(String[] args) 
	{
		int[]a= {-4,-2,9,10};
		
		System.out.println(ChangingSeq(a));
	}
	public static int ChangingSeq(int[]a)
	{
		int cnt=0;
		int ij=0;
		if(a[0]<a[1])
		{
			for (int i = 0; i < a.length-1; i++)
			{
				if(a[i]>a[i+1])
				{
					ij=i;
					cnt++;
					break;
				}
			}
		}
		else
		{
			for (int i = 0; i < a.length-1; i++)
			{
				if(a[i]<a[i+1])
				{
					ij=i;
					cnt++;
					break;
				}
			}
		}
		if(cnt==0)
		{
			return -1;
		}
		else
		{
			return ij;
		}
	}
}
