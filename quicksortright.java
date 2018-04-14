package algorithm;
//本来是不用写的，但想想自己写个选取左边元素为partition的快排那么瓜皮，
//还是再写一遍比较好
public class quicksortright {
	public <T extends Comparable<T>> void quicksort(T array[]) {
		sort(array,0,array.length-1);
	}
	
	public <T extends Comparable<T>> void sort(T array[],int left,int right) {
		if(left<right) {
			int pivot=partition(array,left,right);
			sort(array,left,pivot-1);
			sort(array,pivot+1,right);
		}
	}
	
	public <T extends Comparable<T>> int partition(T array[],int left,int right) {
		//取出最右边的元素作为partition 查看它要放在哪个位置
		int pivot=right;
		T p=array[right];
		right-=1;
		while(left<right) {
			while((left<right)&&(array[left].compareTo(p)<=0)) {
				left++;
			}
			while((right>=left)&&(array[right].compareTo(p)>0)) {
				right--;
			}
			if(left<right) {
				T temp=array[left];
				array[left]=array[right];
				array[right]=temp;
			}
		}
		array[pivot]=array[++right];
		array[right]=p;
		
		return right;
	}
	
	public static void main(String [] args) {
		int [] test= {1,3,4,9,4,5,3,33,900,4,3,1000};
		//int [] test={5,4,3,1,2};
		//int [] test= {12,12,12,12,12};
		Integer [] t=new Integer[test.length];
		for(int i=0;i<test.length;i++) {
			t[i]=test[i];
		}
		quicksortright q=new quicksortright();
		q.quicksort(t);
		for (int i=0;i<t.length;i++) {
			System.out.print(t[i]+"  ");
		}
	}
}
