package quanlitrungtamngoaingu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GiangVien extends Person implements Serializable{
    private String chucvu;
    public GiangVien(){
        
    }
    public GiangVien(String chucvu) {
        this.chucvu = chucvu;
    }

    public GiangVien(String chucvu, String ten, String cccd, String gioitinh, String sdt, String que, String ngaysinh) {
        super(ten, cccd, gioitinh, sdt, que, ngaysinh);
        this.chucvu = chucvu;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    
    

    @Override
    public String toString() {
        return  chucvu+" "
                +super.getTen()+" "
               +super.getNgaysinh()+" "
                +super.getGioitinh()+" "
                +super.getCccd()+" "
                +super.getQue()+" "
                +super.getSdt();
    }
    
    
}
