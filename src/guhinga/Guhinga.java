/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guhinga;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author TUYANDRE
 */
public class Guhinga {
    Map<String, District> district;
    Map<String, Category> category;
    Map<String, Season> season;
    Map<String, Igihingwa> igihingwa;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        check imindity
 Scanner scanner = new Scanner(System.in);
System.out.println("urakaza neza kuri System Y'umuhinzi");
System.out.println("Tugiye kwinjiza data zakarerre");
Guhinga hinga=new Guhinga();
   hinga.addDistrict();
   System.out.println("Ushaka kongera kwinjiza akandi karere andika 1 gukomeza kanda 0");
   int districtchoice=scanner.nextInt();
   switch(districtchoice) {
  case 1:
   hinga.addDistrict();
    break;
  case 0:
    // code block
    break;
  default:
    // code block
}
   
    
}
    public void addDistrict(){
    Scanner scanner = new Scanner(System.in);
    
    String district_name;
    float district_temperature,district_altitude;
    System.out.println("Injiza izina ry'akarere");
    district_name=scanner.nextLine();
    System.out.println("injiza ubushuhe bw'akarerre(urugero:34.6)");
    district_temperature=scanner.nextFloat();
   System.out.println("injiza ubutumburuke bw'akarerre(urugero:34.6)");
   district_altitude=scanner.nextFloat();
   District d1=new District(district_name,district_temperature,district_altitude);
   district.put(district_name,d1);
    }
    
}
