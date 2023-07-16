	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 16, 2023
	 * @version 1.0
	 */
package QuanLyMayTinh;

public class QuocGia {
	private String maQuocGia;
	private String tenQuocGia;
	public QuocGia(String maQuocGia, String tenQuocGia) {
		this.maQuocGia = maQuocGia;
		this.tenQuocGia = tenQuocGia;
	}
	public String getMaQuocGia() {
		return maQuocGia;
	}
	public void setMaQuocGia(String maQuocGia) {
		this.maQuocGia = maQuocGia;
	}
	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
	
}
