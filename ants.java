package algorithm;
import java.util.*;
import java.util.regex.*;
public class ants {
	private int l;
	private int n;
	private Integer[] s;
	ants(int ll,int nn,Integer[] ss){
		l=ll;
		n=nn;
		s=ss;
		System.out.println(l+"  "+n);
		/*for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}*/
	}
	ants(){}
	
	public int max(int i,int j) {return i>j?i:j;}
	public int min(int i,int j) {return i>j?j:i;}
	
	void solve() {
		int minitime=0;
		//System.out.println(n);
		for(int i=0;i<n;i++) {
			minitime=max(minitime,min(s[i],l-s[i]));
			//System.out.println(minitime);
		}
		
		int maxtime=0;
		for(int i=0;i<n;i++) {
			maxtime=max(maxtime,max(s[i],l-s[i]));
		}
		
		System.out.println("min = "+minitime);
		System.out.println("max = "+maxtime);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String line_1=scan.nextLine();
		String line_2=scan.nextLine();
		String line_3=scan.nextLine();
		scan.close();
		
		String pattern="\\d+";
		Pattern r=Pattern.compile(pattern);
		
		int l = 0;
		Matcher m=r.matcher(line_1);
		if(m.find()) {
			l=Integer.parseInt(m.group(0));
		}
		
		int n = 0;
		m=r.matcher(line_2);
		if(m.find()) {
			n=Integer.parseInt(m.group(0));
		}
		
		ArrayList<Integer> x=new ArrayList<Integer>();
		m=r.matcher(line_3);
		while(m.find()) {
			x.add(Integer.parseInt(m.group(0)));
		}
		
		Integer[] s=x.toArray(new Integer[x.size()]);
		
		ants ant=new ants(l,n,s);
		ant.solve();
		
	}
}
