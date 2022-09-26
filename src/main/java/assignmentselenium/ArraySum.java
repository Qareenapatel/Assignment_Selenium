package assignmentselenium;

public class ArraySum {

	public static void main(String[] args) {

		int[] arr = { 3,3,4,5,7,8 };
		int sum = 11;
		getPairsCount(arr, sum);
	}

	public static void getPairsCount(int[] arr, int sum)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if ((arr[i] + arr[j]) == sum) {
					System.out.println("[" + arr[i] + ", " + arr[j] + "]");
				}
			}
		}

	}

}
