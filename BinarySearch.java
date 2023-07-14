// Input must be in sorted order
public class BinarySearch {
	public static void binary(int arr[],int search) {
		int start=0;
		int val=0;
		int end=arr.length-1;
		while(start<=end) {
		int mid = (start+end)/2;
		if(search==arr[mid]) {
			val=-1;
			System.out.println("Value is present "+arr[mid]);
			break;
		}else if(search<arr[mid]) {
			end=mid-1;
		}else if(search>arr[mid]) {
			start=mid+1;
		}
		}
		if(val==0) {
			System.out.println("Value is not present");
		}
	}
	public static void main(String[] args) {
		int arr[] = {6,5,13,20,30,40};
		int search = 40;
		binary(arr,search);
	}
}
//	Time Complexity
//	n+n/2+n/4+n/8+....
//	n/2^0+n/2^1+n/2^2+n/2^3+....
//	(anyvalue)^0=1
//	
//	n/(2^x)=1
//	n=2^x
//	log n = log(2^x)
//	log n = x log2
//	log n = x
//	x = log n
//  Time Complexity is O(logn)