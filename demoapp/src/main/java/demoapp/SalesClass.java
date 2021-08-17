package demoapp;

public class SalesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		int sum=0;
		arr[0]=10;arr[1]=20;arr[2]=40;arr[3]=60;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
			System.out.println(sum);
		}
			
	}

}
