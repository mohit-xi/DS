import java.util.*;
class anagrams{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		char c[]=str1.toCharArray();
		char c1[]=str2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		String str=new String(c);
		String strr=new String(c1);
		if(str.equals(strr)){
			System.out.print("Anagrams");
		}
		else{
			System.out.print("Not Anagrams");
		}
	}
}