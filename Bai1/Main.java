package Lab3;

import java.util.Scanner;

public class Main {
	public static void nhap(Product sp) {
		Scanner sc = new Scanner(System.in);
		OrderDetail od = new OrderDetail(sp, 0); 
		System.out.print("Nhập mã SP : ");
		sp.setProductID(sc.nextLine());
		System.out.print("Nhập mô tả : ");
		sp.setDesciption(sc.nextLine());
		System.out.print("Nhập đơn giá: ");
		sp.setPrice(sc.nextDouble());
		System.out.print("Nhập số lượng : ");
		sp.setQuatity(sc.nextInt());
		
	}
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Product sp = new Product();
		Product s1[] = null;
		OrderDetail od = new OrderDetail(sp, 0); 
		Order o = new Order ();
		System.out.println("Số lượng cần nhập : ");
        int n = sc.nextInt();
        s1 = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Hóa đơn " + (i + 1)+": ");
            s1[i] = new Product ();
            nhap(s1[i]);
        }
		System.out.printf("%10s | %10s | %10s | %10s | %10s | \n", "Mã SP" , "Mô tả", "Đơn giá" ,"S Lượng" , "Thành Tiền");
		 for (int i = 0; i < n; i++) {
             s1[i].hien();
         }
	
	
	
	}
}
	

