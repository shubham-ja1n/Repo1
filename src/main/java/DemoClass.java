
public class DemoClass {
	public static int cube (int n) {
		return n*n*n;
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int findMax(int [] arr) {
		int max = arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static String reverseWord(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reversedString = new String(sb);
		return reversedString;
	}
	public static int findMin(int [] arr) {
		int min = arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}
