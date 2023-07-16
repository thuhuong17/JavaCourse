	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 16, 2023
	 * @version 1.0
	 */
package QuanLyMayTinh;

public class test {
	public static void main(String[] args) {
		NgaySanXuat ngay1 = new NgaySanXuat(15, 07, 2020);
		NgaySanXuat ngay2 = new NgaySanXuat(16, 07, 2020);
		NgaySanXuat ngay3 = new NgaySanXuat(17, 07, 2020);
		
		QuocGia qg1 = new QuocGia("001", "My");
		QuocGia qg2 = new QuocGia("002", "Anh");
		QuocGia qg3 = new QuocGia("003", "Phap");

		HangSanXuat hang1 = new HangSanXuat("hang1", qg3);
		HangSanXuat hang2 = new HangSanXuat("hang2", qg2);
		HangSanXuat hang3 = new HangSanXuat("hang3", qg1);
		
		MayTinh maytinh1 = new MayTinh(hang3, ngay3, 5.5, 6);
		MayTinh maytinh2 = new MayTinh(hang2, ngay1, 6.5, 1);
		MayTinh maytinh3 = new MayTinh(hang1, ngay2, 3.5, 12);
		
		System.out.println("kiem tra re hon: "+maytinh1.kiemTraGiaBanReHon(maytinh3));
		System.out.println("kiem tra re hon: "+maytinh2.kiemTraGiaBanReHon(maytinh3));
		System.out.println("kiem tra re hon: "+maytinh1.kiemTraGiaBanReHon(maytinh2));


		System.out.println("ten quoc gia san xuat may tinh: "+maytinh1.layTenQuocGia());
	}
}
