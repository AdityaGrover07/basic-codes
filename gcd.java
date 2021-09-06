package introduction;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=gcd(a,b);
		System.out.println(ans);

	}
	static int gcd(int a,int b) {
		if(b==0)return a;
		
		return gcd(b,a%b);
			
	}

}
