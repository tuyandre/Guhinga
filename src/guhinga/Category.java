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
    public String category_name;
    public float humidity;
    public float altitude;
    Category(String n,float h,float al){
        this.category_name=n;
        this.altitude=al;
        this.humidity=h;
    }
    public String getName(){
        return this.category_name;
    }
    public float getHumidity(){
        return this.humidity;
       
    }
    public float getAltitude(){
        return this.altitude;
    }
    
}
