// Leetcode problem no.53 for practice....
// Time complexity O(n).
package Algorithm;

public class kadane_Algorithm {
	public static int calculate(int a[], int n) {
		int sum = 0;
		int max = a[0];
		
		// First step
		for(int i=0; i < a.length; i++) {
			sum = sum + a[i];
				
		// Second step
		if(sum > max) {
			max = sum;
		}
		
		// Third step
		if(sum < 0) {
			sum = 0;
		}
	}
		
		return max;	
	}
	public static void main(String[] args) {
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int n = a.length;
		
		int x = calculate(a, n);
		
		System.out.println(x);
	}
}
