	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 16, 2023
	 * @version 1.0
	 */
package QuanLyMayTinh;

public class MayTinh {
	
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaBan;
	private double thoiGianBaoHanh;
	
	public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, double thoiGianBaoHanh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	//viet ham kiem tra re
	public boolean kiemTraGiaBanReHon(MayTinh mayTinhKhac ) {
		return this.giaBan < mayTinhKhac.giaBan;
	}
	public String layTenQuocGia()
	{
		return this.hangSanXuat.layTenQuocGia();
	}
	
	
	
	

}
