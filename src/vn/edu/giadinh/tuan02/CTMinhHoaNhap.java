package vn.edu.giadinh.tuan02;

import java.util.Scanner;//#include<stdio.h>

public class CTMinhHoaNhap {
    public static void main(String[] args) {

       Scanner bienNhap ; // Biến tham chiếu đối tượng
       double diemMon ;
       // Tạo đối tượng
       // Toán tử new
       // Hàm tạo của lớp Scanner
       bienNhap = new Scanner(System.in) ; 
       System.out.print("Nhập vào điểm CCTDL & GT : ");

       diemMon = bienNhap.nextDouble();
       
       System.out.println("Điểm vừa nhập vào là "+ diemMon);


    }
}