	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 16, 2023
	 * @version 1.0
	 */
package QuanLyMayTinh;

public class HangSanXuat {
	private String tenHang;
	private QuocGia quocGia;
	public HangSanXuat(String tenHang, QuocGia quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	public String layTenQuocGia() {
		// TODO Auto-generated method stub
		return this.quocGia.getTenQuocGia();
	}
	
	
	
	

}
