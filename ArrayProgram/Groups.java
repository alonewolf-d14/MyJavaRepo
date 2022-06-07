package Pravin;

public class Groups 
{
	public static void main(String[] args) 
	{
		int[]a= {3,9,7,4,6,8};
		int x=3;
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if((a[i]+a[j])%x==0 && a[i]%x==0 && a[j]%x==0)
				{
					System.out.println(a[i]+","+a[j]);
					cnt++;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				for (int k = j+1; k < a.length; k++)
				{
					if((a[i]+a[j]+a[k])%x==0 && a[i]%x==0 && a[j]%x==0 && a[k]%x==0)
					{
						System.out.println(a[i]+","+a[j]+","+a[k]);
						cnt++;
					}
				}
			}
		}
		System.out.println("no of groups: "+cnt);
	}
}
