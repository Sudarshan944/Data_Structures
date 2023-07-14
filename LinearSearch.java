
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,2,10,15,51};
		int search = 8;
		int temp=0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Found");
				temp=1;
				break;
			}
		}if(temp==0)
		System.out.println("Not Found");
	}

}
// Time Complexity