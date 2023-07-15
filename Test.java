	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 15, 2023
	 * @version 1.0
	 */
package BookManagement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date1 = new Date(15, 7, 2023);
		Date date2 = new Date(16, 7, 2023);
		Date date3 = new Date(18, 7, 2023);
		
		Author author1 = new Author("Nguyen Ngoc Anh", date1);
		Author author2 = new Author("Nguyen Tuan", date2);
		Author author3 = new Author("Tan Da", date3);
		
		Book book1 = new Book("Duong len troi", 50000, 2020, author3);
		Book book2 = new Book("Duong len nui", 50000, 2020, author2);
		Book book3 = new Book("Duong xuong bien", 50000, 2022, author1);
		// in ra ten sach
		book1.printBookName();
		book2.printBookName();
		book3.printBookName();
		
		// kiem tra nam xuat ban
		System.out.println(book1.checkCungNam(book3));
		//kiem tra tong tien sau giam gia

		System.out.println("sau khi giam gia: "+book1.tongSauGiamGia(50));
	}

}
