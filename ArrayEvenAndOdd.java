public class ArrayEvenAndOdd {
	public static void countingEvenAndOdd(int[] arr)
	{
		int even = 0 , odd = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]%2==0)
			{
				++even;
			}else {
				++odd;
			}
		}
		System.out.println("Number of even number is :"+even);
		System.out.println("Number of odd number is :"+odd);
	}
}