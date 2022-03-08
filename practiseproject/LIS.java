package practiseproject;

public class LIS  {
	static int maximumrefence; // storing  the largest increasing subsequence here

	static int findList(int array1[], int number)
	{

		if (number == 1)
			return 1;
		int res, max_ending_here = 1;
		for (int index = 1; index < number; index++)
		{
			res = findList(array1, index);
			if (array1[index - 1] < array1[number - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}
		if (maximumrefence < max_ending_here)
			maximumrefence = max_ending_here;
		return max_ending_here;
	}
	static int lis(int arr[], int n)
	{
		maximumrefence = 1;
		findList(arr, n);
		return maximumrefence;
	}
	public static void main(String args[])
	{
		int b[] = { 9, 22, 91, 37, 23, 50, 41, 60 ,70 ,80,89 ,98,108,213};
		int n = b.length;
		System.out.println("Length of lis is " + lis(b, n) + "\n");
	}
}
