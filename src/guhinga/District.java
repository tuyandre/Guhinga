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
public class District {
    public String name;
    public float temperature;
    public float altitude;
    District(String n1, float b,float na){
        this.name=n1;
        this.temperature=b;
        this.altitude=na;
    }

    District() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public String getName(){
        return this.name;
    }
    public float getTemperature(){
        return this.temperature;
       
    }
    public float getAltitude(){
        return this.altitude;
    }
    
}
