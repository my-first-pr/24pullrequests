// Sorting and Searching in Array
// Sorting using Java Collection's Sort method
import java.util.*;
class saideep {
	public static void main(String args[]) {
		boolean flag = false;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Hello World!");
		System.out.print("\n\nEnter the number of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("\nArray before sorting: ");
		for(i = 0; i < n; i++) {
			System.out.print("  "+arr[i]);
		}
		System.out.println("\n");
		System.out.println("Array after sorting: ");
		Arrays.sort(arr);
		for(i = 0; i < n; i++) {
			System.out.print("  "+arr[i]);
		}
		System.out.println("\n\nEnter no. to search: ");
		int no = scan.nextInt();
		for(i = 0; i < n; i++) {
			if(arr[i] == no) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("\n" + no + " found at position "+(i+1));
		else
			System.out.println("\n" + no + " not found in the array");
	}
}
