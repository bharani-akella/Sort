package interview;
import java.util.Scanner;
public class SelectionSort {

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
           
           System.out.println("Initial array is ");
          for(int i=0;i<size;i++){
        	  System.out.print(a[i]+" ");
          }           
          
          for(int i=0;i<size-1;i++){
        	  for(int j=i+1;j<size;j++){
        		  if(a[j]<a[i]){
        			  int temp=a[i];
        			  a[i]=a[j];
        			  a[j]=temp;
        		  }
        	  }
          }
          
          System.out.println("\nAfter sorting...");
          for(int i=0;i<size;i++){
        	  System.out.print(a[i]+" ");
          }
          
	}

}
