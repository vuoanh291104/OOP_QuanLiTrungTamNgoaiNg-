package quanlitrungtamngoaingu;

import java.io.Serializable;

public class Person implements Serializable{
    protected String ten;
    protected String cccd;
    protected String gioitinh;
    protected String sdt;
    protected String que;
    protected String ngaysinh;
    
    public Person(){
    }
    public Person(String ten, String cccd, String gioitinh, String sdt, String que, String ngaysinh) {
        this.ten = ten;
        this.cccd = cccd;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.que = que;
        this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", cccd=" + cccd + ", gioitinh=" + gioitinh + ", sdt=" + sdt + ", que=" + que + ", ngaysinh=" + ngaysinh + '}';
    }
    
       
}
