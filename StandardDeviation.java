import java.util.Scanner;
import java.lang.Math;
class StandardDeviation{
	public static void main(String args[]){
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		float arr[]=new float[5];
		float mean,sum=0;
		double s=0;
		System.out.println("Enter the Array:");
		for(i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
         for(i=0;i<size;i++){
         	sum+=arr[i];
         }
         System.out.println("Sum is:"+sum);
         mean=sum/size;
         System.out.println("Mean is:"+mean);
         for(i=0;i<size;i++){
         	s+=Math.pow((mean-arr[i]),2);
         }
         System.out.println("Value of s is:\n"+s);
         double variance,s_d;
         variance=s/(size-1);
         System.out.println("Variance is :\n"+variance);
         s_d=Math.sqrt(variance);
         System.out.println("The standard Deviation is:"+s_d);

	}
}