import java.util.*;
import java.util.regex.*;

public class triangle{
	public static void main(String [] args){

		Scanner scan=new Scanner(System.in);
        
		String count=scan.nextLine();
		String array=scan.nextLine();

		String pattern="\\d+";
		Pattern r=Pattern.compile(pattern);
		Matcher m=r.matcher(count);

		if(m.find()){
			//System.out.println(m.group(0));
			int n=Integer.parseInt(m.group(0));
		}

		ArrayList<Integer> a=new ArrayList<Integer>();

		m=r.matcher(array);
		while(m.find()){
			//System.out.println(m.group(0));
			a.add(Integer.parseInt(m.group(0)));
		}

		//now a store the array of length of stick 
		// n store the value of the count of stick

		Collections.sort(a);
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}

		boolean result=false;
		for(int i=a.size()-1;i>1;i--){
			if(a.get(i-1)+a.get(i-2)>a.get(i)){
				System.out.println(a.get(i-1)+a.get(i-2)+a.get(i));
				result=true;
				break;
			}
		}

		if(!result){
			System.out.println(0);
		}



	}
}