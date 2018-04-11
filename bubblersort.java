import java.util.*;
public class bubblersort{
	/*实现bubble 算法
	*不断比较相邻的项，如果顺序不对 就交换位置
	*@param array the array to be sorted
	*@param last the index of the last element of the array to be sorted
	*refer https://github.com/TheAlgorithms/Java/blob/master/Sorts/BubbleSort.java
	*/
			/* T must implements comparable T*/
	public <T extends Comparable<T>> void bs(T array[],int last){
			boolean flag=true;

			while(flag){
				T temp;

				//
				flag=false;
				for(int i=0;i<last-1;i++){
					if(array[i].compareTo(array[i+1])>0){
						temp=array[i+1];
						array[i+1]=array[i];
						array[i]=temp;
						flag=true;
					}
				}
				last--;
			}

	}
	static class testobject implements Comparable<testobject>{
		private int grade;
		private String number;

		public testobject(int g,String s){
			this.grade=g;
			this.number=s;
		}
		/*
		*print the object 
		*/
		public String toString(){
			return "number is "+number+" grade is "+grade;
		}

		//implements comparation
		public int compareTo(testobject o){
			if(o.grade<this.grade){
				return 1;
			}
			else 
			return 0;
		}

	}
	public static void main(String[] args){
		int test[]={2,1,3,4,5};
		int len=test.length;
		Integer [] array=new Integer[len];
		for(int i=0;i<len;i++){
			array[i]=test[i];
		}
		bubblersort client=new bubblersort();
		client.bs(array,5);
		for(int i=0;i<test.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");

		testobject t1=new testobject(99,"20180610");
		testobject t2=new testobject(90,"20180600");
		testobject t3=new testobject(87,"20180590");

		testobject ar[]={t1,t2,t3};

		client.bs(ar,3);

		for (int i=0;i<3;i++)
			System.out.println(ar[i]);


	}
}