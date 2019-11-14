import java.util.*;
class SubCount
{
	static void SubCountt(int arr[],int size,int key)
	{
		int count1=(size*(size+1))/2;
		int count2=((size-key+1)*(size-key+2))/2;
		System.out.print(count2);
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		SubCountt(arr,n,key);
	}
}