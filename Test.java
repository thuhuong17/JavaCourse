	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 15, 2023
	 * @version 1.0
	 */
package FilmManagement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ngay ngay1 = new Ngay(15, 07, 2023);
		Ngay ngay2 = new Ngay(15, 07, 2023);
		Ngay ngay3 = new Ngay(15, 07, 2023);
		
		HangSanXuat hang1 = new HangSanXuat("Hang1", "My");
		HangSanXuat hang2 = new HangSanXuat("Hang2", "Anh");
		HangSanXuat hang3 = new HangSanXuat("Hang3", "Han");

		BoPhim boPhim1 = new BoPhim("tay du ki", 2015, hang3, 80000, ngay3);
		BoPhim boPhi2 = new BoPhim("vao ha", 2015, hang1, 70000, ngay1);
		BoPhim boPhim3 = new BoPhim("bong dung muon khoc", 2015, hang2, 60000, ngay2);

		boPhim1.layTenHangSanXuat();
		System.out.println(boPhim3.kiemTraGiaVeReHon(boPhi2));
		System.out.println(boPhim3.giaSauKhuyenMai(10));
	}

}
