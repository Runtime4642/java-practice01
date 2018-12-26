package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum=0;
		if(input % 2 ==0)
		{
			
			for(int i=0;i<=input;i++)
			{
				if(i%2==0)
					sum+=i;
			}
		}
		else
		{
			for(int i=0;i<=input;i++)
			{
				if(i%2!=0)
					sum+=i;
			}
		}
		System.out.println("결과값 : "+ sum);
		
	}
}
