	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 17, 2023
	 * @version 1.0
	 */
package Java46;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test cau a");
		MayTinhBoTuiInterface mt = new MayTinhCasioFX500();
		System.out.println("cong "+mt.cong(3, 5));
		MayTinhBoTuiInterface mt1 = new MayTinhVinaCal500();
		System.out.println("cong "+mt1.cong(0, 7.5));
		
		System.out.println("test cau b");
		double []arr1 = new double[] {1,7,5,2,9,6};
		double []arr2 = new double[] {7,8,2,9,11,3};
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		sxchen.sapXepTang(arr1);
		for(int i =0; i<arr1.length;i++)
		{
			System.out.print(+arr1[i]+" ");
		}
		System.out.println();
		sxchon.sapXepTang(arr2);
		for(int i =0; i<arr2.length;i++)
		{
			System.out.print(+arr2[i]+" ");
		}
		System.out.println();
		System.out.println("test cau c");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println(+pmmt.cong(5, 2));
		
		double []arr3 = new double[] {1,7,5,2,9,6};
		pmmt.sapXepGiam(arr3);
		for(int i =0; i<arr3.length;i++)
		{
			System.out.print(+arr3[i]+ " ");
		}

	}

}
