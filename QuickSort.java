package interview;
import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,a[];
		Scanner s=new Scanner(System.in);
             System.out.println("Enter the size of array");
             size=s.nextInt();
             a=new int[size];
             for(int i=0;i<size;i++){
            	 System.out.println("Enter the element at position "+i);
            	 a[i]=s.nextInt();
             }
             
             System.out.println("Initial array..");
             for(int i=0;i<size;i++){
            	 System.out.print(a[i]+" ");
             }
             
             QuickSort qs=new QuickSort();
             
             qs.quick_sort(a, 0, size-1);
            
             System.out.println("\nAfter sorting...");
             
             for(int i=0;i<size;i++){
            	 System.out.print(a[i]+" ");
             }
          
	}
	
	public void quick_sort(int a[],int first,int last){
		
		if(first<last){
			int pi=partition(a,first,last);
			quick_sort(a, first, pi-1);
			quick_sort(a, pi+1, last);
		}
		
	}

	public int partition(int[] a, int first, int last) {
		// TODO Auto-generated method stub
		
		int pivot=a[last];
		int p_index=first;
		
		for(int i=first;i<last;i++){
			if(a[i]<pivot){
				int temp=a[i];
				a[i]=a[p_index];
				a[p_index]=a[i];
				
				p_index=p_index+1;
						
			}
		}
		
		int temp=a[p_index];
		a[p_index]=a[last];
		a[last]=temp;
		
	
		
		return p_index;
	}
	
}
