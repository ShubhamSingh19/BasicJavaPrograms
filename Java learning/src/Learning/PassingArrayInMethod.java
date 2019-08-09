package Learning;

public class PassingArrayInMethod 
{
	
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		System.out.println(fun(arr));
	}
	
	public static int fun(int x[])
	{
		int total=0;
		for(int y : x)
		{
			total+=y;
		}
		return total;
	}
	

}
