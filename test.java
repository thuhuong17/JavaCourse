	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 16, 2023
	 * @version 1.0
	 */
package QuanLySinhVien;

public class test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 07, 2001);
		Ngay ngay2 = new Ngay(15, 07, 2002);
		Ngay ngay3 = new Ngay(18, 07, 2003);

		Lop lop1 = new Lop("A", "CNTT");
		Lop lop2 = new Lop("B", "CNTT");
		Lop lop3 = new Lop("C", "CNTT");

		SinhVien sv1 = new SinhVien("001", "Nguyen Van A", ngay3, 4.0, lop3);
		SinhVien sv2 = new SinhVien("002", "Nguyen Van A", ngay3, 5.0, lop2);
		SinhVien sv3 = new SinhVien("003", "Nguyen Van A", ngay1, 8.0, lop1);
		
		sv1.inRaTenKhoa();
		sv2.inRaTenKhoa();
		sv2.inRaTenKhoa();
		
		System.out.println(sv1.dau());
		System.out.println(sv2.dau());
		System.out.println(sv3.dau());
		
		System.out.println("kiem tra ngay thang nam sinh: "+sv1.kiemTraNgaySinhCoGiong(sv3));


	}
}
