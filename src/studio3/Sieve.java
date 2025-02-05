package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How big do you want the array to be?");
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 1; i <= n; i++)
		{
			nums[i-1] = i;
		}
		for (int j = 3; j < n; j = j+2)
		{
			nums[j] = 0;
		}
		for (int l = 5; l < n; l = l+3)
		{
			nums[l] = 0;
		}
		for (int m = 9; m < n; m = m + 5)
		{
			nums[m] = 0;
		}
		for (int o = 13; o < n; o = o + 7)
		{
			nums[o] = 0;
		}
		for (int k = 1; k < n; k++)
		{
			if (nums[k] != 0)
			{
				System.out.println(nums[k]);
			}
		}
	}

}
