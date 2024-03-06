
package quanlitrungtamngoaingu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class KhoaHoc implements Serializable{
    private String ten;
    private String maKhoaHoc;
    private int gia;
    private List<GiangVien> listgiangvien = new ArrayList<>();
    private List<HocVien> listhocvien = new ArrayList<>();
    public KhoaHoc(){
    }

    public KhoaHoc(String ten, String maKhoaHoc, int gia) {
        this.ten = ten;
        this.maKhoaHoc = maKhoaHoc;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String makhoahoc) {
        this.maKhoaHoc = makhoahoc;
    }

    public List<GiangVien> getListgiangvien() {
        return listgiangvien;
    }

    public void setListgiangvien(List<GiangVien> listgiangvien) {
        this.listgiangvien = listgiangvien;
    }

    public List<HocVien> getListhocvien() {
        return listhocvien;
    }

    public void setListhocvien(List<HocVien> listhocvien) {
        this.listhocvien = listhocvien;
    }      
    public void addGiangVien(GiangVien a){
        listgiangvien.add(a);
    }
    public void addHocVien(HocVien a){
        listhocvien.add(a);
    }
    @Override
    public String toString() {
        return "Khóa Học: "+ this.getTen() 
                +"\nMã khóa học:  "+ this.getMaKhoaHoc()
                +"\nGiá tiền: "+ this.getGia();
    }
    
}
