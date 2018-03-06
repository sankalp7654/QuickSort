package sankalp;

public class QuickSort {

	public void quickSort(int a[], int low, int high) {
		if(low < high) {
			int j = partition(a, low, high);
			quickSort(a, low, j-1);
			quickSort(a, j+1, high);
		}
	}
	public int partition(int a[], int low, int high) {
		int temp;
		int pivot = a[low]; 
		int i = low;
		int j = high;
		while(low < high) {
			while((a[i] < pivot) && (i < high)) 
				i++;
			while((a[j] > pivot) && (j > 0))
				j--;
			if(i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			else{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				return j;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int a[] = new int [] {56, 78, 34, 65, 69 };
		for(int count : a)
			System.out.println(count);
		System.out.println();
		quickSort.quickSort(a, 0, 4);
		for(int count : a)
			System.out.println(count);
	}
}
