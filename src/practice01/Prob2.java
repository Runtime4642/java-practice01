package practice01;

public class Prob2 {
	public static void main(String[] args) {
		
		int i=0;
		while(i<10)
		{
			for(int j=i,a=0;a<10;j++,a++)
				System.out.print(j+" ");
			i++;
			System.out.print("\n");
		}
	}
}
