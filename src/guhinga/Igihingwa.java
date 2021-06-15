/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guhinga;

/**
 *
 * @author TUYANDRE
 */
public class Igihingwa extends Category{
    
     public String name;
     public float avgwaterSoil,temperature;
     
     
     Igihingwa(String category_name, float h, float al,String name,float avg,float temp) {
//        super(category_name, h, al);
        this.name=name;
        this.category_name=category_name;
        this.altitude=al;
        this.humidity=h;
        this.avgwaterSoil=avg;
        this.temperature=temp;
        
    }
   

//    Igihingwa() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
}
