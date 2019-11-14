import java.util.*;
class reverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		char arr[]=str.toCharArray();
		int l=str.length();
		char temp[]=new char[l];
		int j=0;
		for(int i=0;i<l;i++){
			if(arr[i]<=122 && arr[i]>=65){
				
				temp[j]=arr[i];
				j++;
			}

		}

		//System.out.println();
		
		/*for(int i=0;i<j;i++){
			System.out.println(temp[i]);
		}*/
		char rev[] = new char[j]; 
        int m=j; 
        for (int i=0;i<j;i++) { 
            rev[m-1]=temp[i]; 
            m=m-1; 
        } 
      

        int s=0;

        for(int i=0;i<l;i++){
			if(arr[i]<=122 && arr[i]>=65){
				
				arr[i]=rev[s];
				s++;
			}

		}
		System.out.println();
		
		System.out.print("Str=");
		for(int i=0;i<l;i++){
			System.out.print(arr[i]);
		}
	}
}
