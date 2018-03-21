package algorithm;
import java.util.*;
import java.util.regex.*;

public class lakecount {
	char [][] jihe;
	
	void dfs(int x ,int y,int n,int m) {
		jihe[x][y]='.';
		for(int xx=-1;xx<2;xx++) {
			for(int yy=-1;yy<2;yy++) {
				int dx=x+xx,dy=y+yy;
				if(dx>=0&&dx<n&&dy>=0&&dy<m&&jihe[x+xx][y+yy]=='W')
					dfs(x+xx,y+yy,n,m);
			}
		}
		
		return;
	}
	
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		String wn=scan.nextLine();
		lakecount count=new lakecount();
		count.jihe=new char[n][m];
		String temp;
		for(int i=0;i<n;i++) {
			temp=scan.nextLine();
			for(int j=0;j<m;j++) {
				
			count.jihe[i][j]=temp.charAt(j);
			}
			//enter=scan.next();
		}
		int res=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(count.jihe[i][j]);
			}
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(count.jihe[i][j]=='W') {
					count.dfs(i,j,n,m);
					res++;
				}
			}
		}
		
		System.out.println(res);
		
	}
}
