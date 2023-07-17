	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 17, 2023
	 * @version 1.0
	 */
package Java46;

public class SapXepChen implements SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		double key;
		int i, j;
		for(i=1; i<n;i++)
		{
			key = arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		double key;
		int i, j;
		for(i=1; i<n;i++)
		{
			key = arr[i];
			j=i-1;
			while(j>=0 && arr[j]<key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}

}
