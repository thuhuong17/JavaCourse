	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 16, 2023
	 * @version 1.0
	 */
package QuanLySinhVien;

public class SinhVien {
	private String maSoSinhVien;
	private String hoVaTen;
	private Ngay ngayThangNamSinh;
	private double diemTB;
	private Lop lop;
	
	public SinhVien(String maSoSinhVien, String hoVaTen, Ngay ngayThangNamSinh, double diemTB, Lop lop) {
		this.maSoSinhVien = maSoSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngayThangNamSinh = ngayThangNamSinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}

	public String getMaSoSinhVien() {
		return maSoSinhVien;
	}

	public void setMaSoSinhVien(String maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Ngay getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public void setNgayThangNamSinh(Ngay ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public void inRaTenKhoa()
	{
		System.out.println("ten khoa: "+this.lop.getTenKhoa());
	}
	public boolean dau()
	{
		return this.diemTB >=5;
	}
	public boolean kiemTraNgaySinhCoGiong(SinhVien sinhVienKhac)
	{
		return this.ngayThangNamSinh.equals(sinhVienKhac.ngayThangNamSinh);
	}
	
	
	

}
