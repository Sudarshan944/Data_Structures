package Sorting;


//public class SelectionSort {
//	public static void Selection(int []arr) {
//		int i,j,temp,index;
//		int n = arr.length;
//		for(i=0;i<n;i++) {
//			index=i;
//			for(j=i+1;j<n;j++) {
//				if(arr[j]<arr[index]) {
//					index=j;
//				}
//			}
//			if(index!=i) {
//				temp=arr[i];
//				arr[i]=arr[index];
//				arr[index]=temp;
//			}
//		}
//		for(i=0;i<n;i++){
//			System.out.print(arr[i]+" ");
//		}
//	}
//	public static void main(String[] args) {
//		int arr[] = {6,5,20,13,40,30};
//		Selection(arr);
//	}
//}

public class SelectionSort {
	public static void Selection(int []arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int temp=i;
			for(int j=i+1;j<n;j++) {
				if(arr[temp]<arr[j]) {
					temp=j;
				}
			}
			int sm = arr[temp];
			arr[temp]=arr[i];
			arr[i]=sm;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {6,5,100,20,30,40};
		Selection(arr);
	}
}
