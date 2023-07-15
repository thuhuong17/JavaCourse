	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 15, 2023
	 * @version 1.0
	 */
package FilmManagement;

public class HangSanXuat {
	private String tenHangSanXuat;
	private String quocGia;
	
	public HangSanXuat(String tenHangSanXuat, String quocGia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
	public void layten() {
		System.out.println(this.getTenHangSanXuat());
	}
	
	

}
