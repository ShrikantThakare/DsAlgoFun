package ArrayandString;

public class rotateArrayByPositions {
	void leftRotate(int arr[], int d, int n) {
		rvereseArray(arr, n - d, n - 1);
		rvereseArray(arr, 0, n - 1 - d);
		rvereseArray(arr, 0, n - 1);
	}

	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.println(arr[i]);
	}

	void rvereseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
			int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
			rotateArrayByPositions r = new rotateArrayByPositions();
			r.leftRotate(arr, 2, 7);
			r.printArray(arr, 7);
		
	}
}
