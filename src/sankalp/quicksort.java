package quicksort;
import java.util.*;
public class quicksort {

	public static int partition(int a[],int low,int high) {
		int pivot=a[low];
		int i=low,j=high;	
		int temp;
		
		while(i<j) {
			while((a[i]<=pivot) && (i<high))
				i++;
			while((a[i]>=pivot) && (j>low))
				j--;
			if(i<j) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
			a[low]=a[j];
			a[j]=pivot;
			return j;	
	}
	
	public static void quicksort1(int a[],int low,int high) {
		if(low<high) {
			int p=partition(a,low,high);
			quicksort1(a,low,p-1);
			quicksort1(a,p+1,high);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		int a[]=new int[n];
		for(;;) {
			System.out.println("1.best\n2.avg\n3.worst\n4.exit");
			int choose=scan.nextInt();
			
			switch(choose) {
			case 1:
				Random random=new Random();
				for(int i=0;i<n;i++) 
					a[i]=random.nextInt(n);
				long start=System.nanoTime();
				quicksort1(a,0,n-1);
				long end=System.nanoTime();
				System.out.print("time taken is:" +(end-start)/100000 + "lack ns");
				scan.close();
			case 2:
				for(int i=0;i<n;i++)
					a[i]=n-i;
				long start1=System.nanoTime();
				quicksort1(a,0,n-1);
				long end1=System.nanoTime();
				System.out.print("time taken is:" +(end1-start1)/100000 + "lack ns");
				scan.close();
			case 3:
				for(int i=0;i<n;i++)
					a[i]=i;
				long start2=System.nanoTime();
				quicksort1(a,0,n-1);
				long end2=System.nanoTime();
				System.out.print("time taken is:" +(end2-start2)/100000 + "lack ns");
				scan.close();
			case 4:
				System.exit(0);
			}
		}
	}
}
