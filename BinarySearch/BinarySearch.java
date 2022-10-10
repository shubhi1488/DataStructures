public class BS {
	int BinarySearch(int arr[],int l,int r,int x) {
		 if (r >= l) {
	            int mid = l + (r - l) / 2;
	 
	            
	            if (arr[mid] == x)
	                return mid;
	 
	            
	            if (arr[mid] > x)
	                return BinarySearch(arr, l, mid - 1, x);
	 
	          
	            return BinarySearch(arr, mid + 1, r, x);
	        }
	 
	        
	        return -1;
	}
	public static void main(String args[]) {
		 BS ob = new BS();
	        int arr[] = { 2, 3, 4, 10, 40 };
	        int n = arr.length;
	        int x = 10;
	        int result = ob.BinarySearch(arr, 0, n - 1, x);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index "
	                               + result);
			
	}

}
