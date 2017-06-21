

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of line");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter coins:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int me=0,friend=0;
		for(int i=0;i<arr.length;i=i+2)
		{
			if(i==arr.length-1)
				break;
			me=me+arr[i];
			friend=friend+arr[i+1];
			
	    }
		if(me>friend)
			System.out.println("I won the game:"+me);
		else if(me<friend)
			System.out.println("My friend won the game:"+friend);
		else
			System.out.println("Game drawn");
	}

}
