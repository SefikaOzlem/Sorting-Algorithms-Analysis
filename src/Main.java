import java.util.Scanner;

public class Main 
{

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Sort s=new Sort();
		Time t=new Time();
		int arraymain[]=menu2();
		int temp1[]=new int[arraymain.length];
		int temp2[]=new int[arraymain.length];
		int temp3[]=new int[arraymain.length];
		for(int i=0;i<arraymain.length;i++)
		{
			temp1[i]=arraymain[i];
			temp2[i]=arraymain[i];
			temp3[i]=arraymain[i];
		}
		menu();
		int select=0;
		while (select!=4)
		{	
		   select=scan.nextInt();
			if(select==1)
			{			
				for(int i=0;i<temp1.length;i++)
				{
				//	System.out.print(temp1[i]+" ");
				}
				System.out.println();
				t.start();
				s.heapSort(temp1);
				t.stop();
				for(int i=0;i<temp1.length;i++)
				{
				//	System.out.print(temp1[i]+" ");
				}
				System.out.println();
				System.out.println("Processing Time: "+t.getElapsedMilliseconds());
			}	
			else if (select==2)
			{
				
				for(int i=0;i<temp2.length;i++)
				{
				    // System.out.print(temp2[i]+" ");
				}
				System.out.println();
				t.start();
				s.DualPivotQuicksort(temp2, 0, temp2.length-1);
				t.stop();
				for(int i=0;i<temp2.length;i++)
				{
				//	System.out.print(temp2[i]+" ");
				}
				System.out.println();
				System.out.println("Processing Time: "+t.getElapsedMilliseconds());
			}
			else if (select==3)
			{
				
				for(int i=0;i<temp3.length;i++)
				{
					//System.out.print(temp3[i]+" ");
				}
				System.out.println();
				t.start();
				s.ShellSort(temp3);
				t.stop();
				for(int i=0;i<temp3.length;i++)
				{
					//System.out.print(temp3[i]+" ");
				}
				System.out.println();
				System.out.println("Processing Time: "+t.getElapsedMilliseconds());
			}
		}

	}
	static void menu()
	{
		System.out.println("Enter 1 for the heapsort");
		System.out.println("Enter 2 for the dual pivot quicksort");
		System.out.println("Enter 3 for the shellsort");
	}
	static int [] menu2()
	{
		System.out.println("Enter the array length");
		GenerateNumber m=new GenerateNumber();
		int array[]=new int[m.n];
		System.out.println("Enter 1 for the equalnumbers array");
		System.out.println("Enter 2 for the random numbers array");
		System.out.println("Enter 3 for the increasing numbers array");
		System.out.println("Enter 4 for the decreasing numbers array");
		int arrayType=scan.nextInt();
		if (arrayType==1)
		{
			System.out.println("Enter a number :");
			m.equal();
			array=m.arraynumbers;
		}
		else if (arrayType==2)
		{
			m.random2();
			array=m.arraynumbers;
		}
		else if (arrayType==3)
		{
			m.increasing();
			array=m.arraynumbers;
		}
		else if (arrayType==4)
		{
			m.decreasing();
			array=m.arraynumbers;
		}
		return array;
	}

}
