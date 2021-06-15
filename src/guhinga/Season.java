/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guhinga;

import java.util.Date;

/**
 *
 * @author TUYANDRE
 */
public class Season {
    public String name;
//    public Date start_date;
//    public Date end_date;
    public float temperature;
    public float avgwaterSoil;
    public float humidity;
    public float altitude;
    
    Season(String name,float temp,float avg,float humidity,float alti){
        this.name=name;
//        this.start_date=start_date;
        this.avgwaterSoil=avg;
//        this.end_date=end_date;
        this.temperature=temp;
        this.altitude=alti;
        this.humidity=humidity;
    }

    Season() {
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
    public float getHumidity(){
        return this.humidity;
       
    }
//    public Date getStartDate(){
//        return this.start_date;
//       
//    }
//    public Date getEndDate(){
//        return this.end_date;
//       
//    }
}
