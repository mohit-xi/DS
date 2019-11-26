import java.util.*;
class RemoveAllDup{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String str=sc.next();
	System.out.println();
	int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				if(count==0)
				{
				System.out.print(str.charAt(i));
				
				}
				else
				{
					count=0;
				}
			}
			if(str.charAt(i)==str.charAt(i+1))
			{
				count=1;
			}
		}
		if(str.charAt(str.length()-2)!=str.charAt(str.length()-1))
		{
			System.out.print(str.charAt(str.length()-1));
		}
	}
}