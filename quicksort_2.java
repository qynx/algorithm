//implement quiksort
//quicsort——1 不能处理有多个相同元素
import java.io.*;
import java.util.*;
public class quicksort_2{

	public <T extends Comparable<T>> void quiksort(T [] array){

		sort(array,0,array.length-1);
	}

	public <T extends Comparable<T>> void sort(T [] array,int left,int right){
		if(left<right){
			System.out.println("division...");
			System.out.println(left+"	"+right);

			int pivot=partition(array,left,right);                             

			System.out.println("选择第"+pivot+"个");
			Scanner scan=new Scanner(System.in);
			String temp=scan.nextLine();
			//if(pivot!=right){  //gen ju dai ma luo ji pivot==right shi zuo bian yi pai hao xu
				//chong fu diao yong hui si xun huan
			sort(array,left,pivot);//}
			sort(array,pivot+1,right);
		}
	}

	public <T extends Comparable<T>> int partition(T [] array,int left,int right){
		//select the left element as pivot
		System.out.println("enter the partition...");
		T pivot=array[left];
		int l=left;
		//right+=1;  //keep the consistence of data
		while(left<right){

			//问题在于不能上来就直接加
			//假设  900 5 10
			//      900 与 10交换后 仍需10 与比较 若直接索引加之后 就会出错

			//条件的判断有问题，一方面left要小于right 另一方面left的位置不能大于pivot
			//自己这样判断无法去除left所在位置大于pivot的情况
			//整体的规划有问题 

			while((left<right)&&(array[left].compareTo(pivot)<=0)){
				left++;
			}
			while((right>left)&&(array[right].compareTo(pivot)>0)){
				right--;
			}
			
			if(left<=right){
				System.out.println("移动后..."+left+"	"+right);
				System.out.println(array[left]+"与"+array[right]+"交换");
				T temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				System.out.println("排序后的分组为:");
				for(int i=0;i<array.length;i++){
					System.out.print(array[i]+" ");
				}
				System.out.println(" ");
			}

		}
		//想一想自己这么一套算法过后 pivot左边 右边元素各是什么样的
		array[l]=array[left];
		array[left]=pivot;
		System.out.println(left);
		return left;
	}

	public static void main(String [] args){

		//int test[]={1,3,4,9,4,5,3,33,900,4,3,10};
		int test[]={5,4,3,1,2};
		Integer t[]=new Integer[test.length];

		for(int i=0;i<test.length;i++){
			t[i]=test[i];
		}
		quicksort_2 q=new quicksort_2();

		q.quiksort(t);
		System.out.println("from main--------");
		for(int i=0;i<t.length;i++){
			System.out.print(t[i]+" ");
		}

		System.out.println("");
	}
}