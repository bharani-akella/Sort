package interview;
import java.util.Scanner;
public class BubbleSort {

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
          
      for(int k=1;k<size;k++){
    	  int flag=0;
    	  for(int i=0;i<size-1;i++){
    		  if(a[i]>a[i+1]){
    			  int temp=a[i];
    			  a[i]=a[i+1];
    			  a[i+1]=temp;
    			  flag=1;
    		  }
    	  }
    	  if(flag==0)break;
      }
          
          
          System.out.println("\nAfter sorting...");
          for(int i=0;i<size;i++){
        	  System.out.print(a[i]+" ");
          }
          
	}

}
