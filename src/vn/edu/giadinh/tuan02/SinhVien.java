package vn.edu.giadinh.tuan02;

import java.util.Date;

public class SinhVien {

    // 1. thuộc tính
     String mssv ;
     String tenSinhVien ;
     String lopHoc ;
     String queQuan ;
     Date ngaySinh ;

    // 2. phương thức
    // <kiểu trả về> <tên hàm> <(danh sách tham số)>{mã cài đặt}
    void inThongTin(){
        System.out.println("Mã số sinh viên : "+mssv);
        System.out.println("Lớp học : "+lopHoc);
        System.out.println("Tên sinh viên : "+tenSinhVien);
        System.out.println("Quê quán : "+queQuan);

    }
    
}
