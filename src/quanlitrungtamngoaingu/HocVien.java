
package quanlitrungtamngoaingu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class HocVien extends Person implements Serializable{
    
   
    public  HocVien(){
        
    }

    

    public HocVien( String ten, String cccd, String gioitinh, String sdt, String que, String ngaysinh) {
        super(ten, cccd, gioitinh, sdt, que, ngaysinh);
        
        
    }



    @Override
    public String toString() {
        return super.getTen()+" "
               +super.getNgaysinh()+" "
                +super.getGioitinh()+" "
                +super.getCccd()+" "
                +super.getQue()+" "
                +super.getSdt();
    }
    
    

   

    
    
}
