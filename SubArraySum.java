import java.util.*;
class SubArraySum{
	public int SubSum(int arr[],int sum){
		int i,j;
		int temp;
		for(i=0;i<arr.length;i++){
			temp=arr[i];

			for(j=i+1;j<=arr.length;j++){
				if(temp==sum){
					System.out.println("Starting index="+i+" "+"Ending index="+(j-1));
					return 1;
				}
				if(temp>sum || j==arr.length){
					break;
				}
				temp=temp+arr[j];
			}
			
			
		}
		System.out.println("No Sub Array Found");
		return 0;

	}
	public static void main(String[] args) {
	SubArraySum obj=new SubArraySum();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter Sum");
	int sum=sc.nextInt();
	obj.SubSum(arr,sum); 	
	}
}