package interview;
import java.util.Scanner;
public class MergeSort {

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
             
             MergeSort ms=new MergeSort();
             ms.sort(a, 0, a.length-1);
             System.out.println("\nAfter sorting...");
             
             for(int i=0;i<size;i++){
            	 System.out.print(a[i]+" ");
             }
          
	}
	
	public void sort(int a[],int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			sort(a, left, mid);
			sort(a, mid+1, right);
			merge(a,left,mid,right);
		}
	}

	public void merge(int[] a, int left, int mid, int right) {
		// TODO Auto-generated method stub
		
		int size1=mid-left+1;
		int size2=right-mid;
		
		int L[]=new int[size1];
		int R[]=new int[size2];
		
		for(int i=0;i<size1;i++){
			L[i]=a[left+i];
		}
		
		for(int j=0;j<size2;j++){
			R[j]=a[mid+1+j];
		}
		
		int i=0,j=0;
		int k=left;
		
		while(i<size1 && j<size2){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
			}else{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<size1){
			a[k]=L[i];
			i++;
			k++;
		}
		
		while(j<size2){
			a[k]=R[j];
			j++;
			k++;
		}
		
	}

}
