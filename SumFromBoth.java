import java.util.*;
class SumFromBoth{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of first array");
		int m=sc.nextInt();
		int A[]=new int[m];
		System.out.println();
		System.out.println("Enter elements of first array");
		for(int i=0;i<m;i++){
			A[i]=sc.nextInt();
		}
		System.out.println("Enter Size of second array");
		int n=sc.nextInt();
		int B[]=new int[n];
		System.out.println();
		System.out.println("Enter elements of first array");
		for(int i=0;i<n;i++){
			B[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter sum to be checked");
		int sum=sc.nextInt();
		System.out.println();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if((A[i]+B[j])==sum){
					System.out.println(A[i]+","+B[j]);
				}
			}
		}
	}
}