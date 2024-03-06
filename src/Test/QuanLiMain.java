
package Test;

import GD.fmStart;
import GD.jmMain;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.UIManager;
import quanlitrungtamngoaingu.GiangVien;
import quanlitrungtamngoaingu.HocVien;
import quanlitrungtamngoaingu.KhoaHoc;


public class QuanLiMain {
    private static File path = new File("D:\\QuanLiTrungTamNgoaiNgu\\QuanLiTrungTamNgoaiNgu\\data.bin");
    private static List<KhoaHoc> dsKhoaHoc = new ArrayList<>();
    
    public  static void luufile(File file, List<KhoaHoc> list){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(KhoaHoc o: list){
                oos.writeObject(o);
            }
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<KhoaHoc> docfile() {
        List<KhoaHoc> tmp = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(is);

            while (true) {
                try{
                    KhoaHoc o = (KhoaHoc)ois.readObject();
                    if (o == null) break;
                    if(o instanceof KhoaHoc){
                        tmp.add((KhoaHoc)o);
                    }
                }catch(EOFException e){
                    break;
                }
                
            }
            ois.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return tmp;
    }
    public static void data_goc(){
        List<GiangVien> listG= new ArrayList<GiangVien>();
        List<HocVien> listH=  new ArrayList<>();
        HocVien c1= new HocVien("Nguyễn Nam Anh", "096456345189","Nữ","078561425","Hà Nội","30/01/2004");
        HocVien c2= new HocVien("Trần Lê Hân","089248175682","Nữ","089625618","Hưng Yên","01/02/2004");
        listH.add(c2);
        listH.add(c1);
        GiangVien a1= new GiangVien("Giảng viên","Nguyễn Hải Hà","077527447642","Nữ","0397586120","Nam Định","07/02/1989");
        GiangVien a2= new GiangVien("Giảng viên","Lê Hải Vân","073926742913","Nữ","0383764664","Sóc Trăng","13/12/1990");
        GiangVien a3= new GiangVien("Trợ giảng","Lê Hoàng Giang","071935718352","Nam","0345267814","Thành phố Hồ Chí Minh","29/03/2001");
        GiangVien a4= new GiangVien("Giảng viên", "Phạm Anh Tuấn","035896132678","Nam","029720735","Hà Nam","01.09.1997");
        GiangVien a5= new GiangVien("Trợ giảng","Nguyễn Vân Anh","077569102456","Nữ","054190526","Bình Phước","29/08/2003");
        GiangVien a6= new GiangVien("Giảng viên","Vương Vĩ Dạ","056728391625","Nam","0257361977","Đồng Nai","17/03/1999");
        GiangVien a7= new GiangVien("Giảng viên", "Lê Hải Anh","077566418275","Nữ","059090526","An Giang","29/01/1997");
        KhoaHoc n1= new KhoaHoc("Khóa N1", "N01",9500000);
        KhoaHoc n2= new KhoaHoc("Khóa N2", "N02",8550000);
        KhoaHoc n3= new KhoaHoc("Khóa N3", "N03",6400000);
        KhoaHoc n4= new KhoaHoc("Khóa N4", "N04",5500000);
        KhoaHoc n5= new KhoaHoc("Khóa N5", "N05",3550000);
        
        n1.addHocVien(c1);
        n2.addHocVien(c2);
        n3.addHocVien(c1);
        n4.addHocVien(c2);
        n5.addHocVien(c1);
        n5.addHocVien(c2);
        
        n1.addGiangVien(a7);
        n1.addGiangVien(a1);
        n1.addGiangVien(a5);
//        listG.removeAll(listG);
        
        n2.addGiangVien(a2);
        n2.addGiangVien(a6);
        n2.addGiangVien(a3);
//        listG.removeAll(listG);
        
        n3.addGiangVien(a4);
        n3.addGiangVien(a5);
//        listG.removeAll(listG);
        
        n4.addGiangVien(a6);
//        listG.removeAll(listG);
        
        n5.addGiangVien(a4);
//        listG.removeAll(listG);
   
//        QuanLiTrungTam.them(n5);
//        QuanLiTrungTam.them(n4);
//        QuanLiTrungTam.them(n3);
//        QuanLiTrungTam.them(n2);
//        QuanLiTrungTam.them(n1);



        
//        QuanLiTrungTam.them(c1);
  //      QuanLiTrungTam.them(c2);
    
  
         dsKhoaHoc.add(n1);
         dsKhoaHoc.add(n2);
         dsKhoaHoc.add(n3);
         dsKhoaHoc.add(n4);
         dsKhoaHoc.add(n5);
        
        luufile(path, dsKhoaHoc);
        
       
    
    }
    public static void SaveData(){
        try {
            OutputStream os = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(KhoaHoc o: dsKhoaHoc){
                oos.writeObject(o);
            }
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        data_goc(); 

        dsKhoaHoc = docfile();
        
//        
//        KhoaHoc n1 = new KhoaHoc();
//        KhoaHoc n2 = new KhoaHoc();
//        KhoaHoc n3 = new KhoaHoc();
//        KhoaHoc n4 = new KhoaHoc();
//        KhoaHoc n5 = new KhoaHoc();
//        for(var o : dsKhoaHoc){
//            if(o.getTen().equals("Khóa N1")){
//                n1 = o;
//            }else if(o.getTen().equals("Khóa N2")){
//                n2=o;
//            }else if(o.getTen().equals("Khóa N3")){
//                n3=o;
//            }else if(o.getTen().equals("Khóa N4")){
//                n4=o;
//            }else if(o.getTen().equals("Khóa N5")){
//                n5=o;
//            }
//        }
//        List<KhoaHoc> khoahoc = new ArrayList<>();
//        khoahoc.add(n5);
//        khoahoc.add(n4);
//        khoahoc.add(n3);
//        khoahoc.add(n2);
//        khoahoc.add(n1);
//        luufile(new File("D:\\QuanLiTrungTamNgoaiNgu\\QuanLiTrungTamNgoaiNgu\\data.bin"), khoahoc);
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new fmStart(dsKhoaHoc).setVisible(true);
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
