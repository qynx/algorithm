//implement quiksort
//quicsort——1 不能处理有多个相同元素
import java.io.*;
import java.util.*;
public class quicksort{

	public <T extends Comparable<T>> void quiksort(T [] array){

		sort(array,0,array.length-1);
	}

	public <T extends Comparable<T>> void sort(T [] array,int left,int right){
		if(left<right-1){
			System.out.println("division...");
			System.out.println(left+"	"+right);

			int pivot=partition(array,left,right);                             

			System.out.println(pivot);
			Scanner scan=new Scanner(System.in);
			String temp=scan.nextLine();

			sort(array,left,pivot);
			sort(array,pivot+1,right);
		}
	}

	public <T extends Comparable<T>> int partition(T [] array,int left,int right){
		//select the left element as pivot
		T pivot=array[left];
		int l=left;
		right+=1;  //keep the consistence of data
		while(left<right){

			
			while(((left++)>=0)&&(left<right)&&(array[left].compareTo(pivot)<=0)){

			}
			while(((right--)>=0)&&(right>left)&&(array[right].compareTo(pivot)>0)){

			}
			
			if(left<right){
				T temp=array[left];
				array[left]=array[right];
				array[right]=temp;
			}

		}

		array[l]=array[--left];
		array[left]=pivot;
		return left;
	}

	public static void main(String [] args){

		int test[]={1,3,4,9,4,5,3,33,900,4,3,10};

		Integer t[]=new Integer[test.length];

		for(int i=0;i<test.length;i++){
			t[i]=test[i];
		}
		quicksort q=new quicksort();

		q.quiksort(t);
		System.out.println("from main--------");
		for(int i=0;i<t.length;i++){
			System.out.print(t[i]+" ");
		}

		System.out.println("");
	}
}