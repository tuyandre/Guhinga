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
public class Category {
    public String name;
    public float humidity;
    public float altitude;
    Category(String n,float h,float al){
        this.name=n;
        this.altitude=al;
        this.humidity=h;
    }

    Category() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return this.name;
    }
    public float getHumidity(){
        return this.humidity;
       
    }
    public float getAltitude(){
        return this.altitude;
    }
    
}
