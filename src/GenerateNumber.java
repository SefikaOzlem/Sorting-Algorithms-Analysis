
import java.util.Random;
import java.util.Scanner;
public class GenerateNumber
{
	static Scanner scan=new Scanner(System.in);
	static Random random=new Random();
	static int n=scan.nextInt();
	static int arraynumbers[]=new int[n];
	public static void random2()
	{	
		for(int i=0;i<n;i++)
		{
			int rand1=random.nextInt(n);
			arraynumbers[i]=rand1;
		}
	}
	public static void random() // Generating different random integers
	{	
		int newNum; 
		boolean flag = true;
		for (int i = 0; i <arraynumbers.length; i++)
		{
			while (flag)
			{
				newNum =random.nextInt(n)+1;
				if (i == 0)
				{
					arraynumbers[0] = newNum;
					break; 
				}
				for (int k = 0; k < i; k++)
				{
					if (arraynumbers[k] == newNum) 
					{
						flag = true;
						break; 
					}
					else
						flag = false;
				}
				if (flag == false)
					arraynumbers[i] = newNum;
			}
			flag = true;
		}
	}
	public static void equal()
	{
		int number=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			arraynumbers[i]=number;
		}
	}
	public static void increasing()
	{
		for(int i=0;i<n;i++)
		{
			arraynumbers[i]=i+1;
		}
	}
	public static void decreasing()
	{
		int number=n;
		for(int i=0;i<n;i++)
		{
			arraynumbers[i]=number--;
		}
	}
	
}
