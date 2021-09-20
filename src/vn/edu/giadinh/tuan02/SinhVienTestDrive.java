package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {

     public static void main(String[] args) {

      SinhVien sinhVien ; // khai báo biến tên là sinhVien tham chiếu đối tượng kiểu SinhVien
      sinhVien = new SinhVien(); // tạo đối tượng sinh viên trong vùn nhớ Heap
      sinhVien.mssv = "2005110008" ;
      sinhVien.tenSinhVien = "Nguyễn Trí Tuấn Phong" ;
      sinhVien.lopHoc = "K14DCMT01" ;
      sinhVien.queQuan = "Tân Trụ Long An" ;
      sinhVien.inThongTin();

             
         
     }
    
}
