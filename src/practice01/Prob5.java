package practice01;

public class Prob5 {

	public static void main(String[] args) {
		String result="";
		for(int i=1;i<=99;i++)
		{
			
			String s = Integer.toString(i);
			for(int j=0;j<s.length();j++)
			{
				if(Integer.parseInt(s.substring(j,j+1))%3==0)
					result+="짝";
			}
			System.out.println(i+" "+result);
			result = "";
		}
	}
}
