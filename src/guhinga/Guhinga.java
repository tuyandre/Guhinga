/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guhinga;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author TUYANDRE
 */
public class Guhinga {
    Map<String, District> district=new HashMap<>();;
    Map<String, Category> category=new HashMap<>();;
    Map<String, Season> season=new HashMap<>();;
    Map<String, Igihingwa> igihingwa=new HashMap<>();;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        check imindity
 Scanner scanner = new Scanner(System.in);
 Guhinga hinga=new Guhinga();
    System.out.println("urakaza neza kuri System Y'umuhinzi");

    
        System.out.println("Tugiye kwinjiza data zakarerre");
        hinga.addDistrict();
        System.out.println("Tugiye kwinjiza data z'igihembwe kihinga");
        hinga.addSeason();
        System.out.println("Tugiye kwinjiza data z'ubwoko bw'igihingwa");
        hinga.addCategory();
        System.out.println("Tugiye kwinjiza data z'igihingwa");
        hinga.addPlant();
        
        System.out.println("hitamo amahitamo yawe:\n 1:Kwinjizamo akarere \n 2:Kwinjiza igihembwe kihinga \n 3:Kwinjiza igihembwe kihinga \n 4:kwinjiza Igihingwa \n5: Result \n 6:Exit");
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:
            hinga.addDistrict();
        break;
        case 2:
             hinga.addSeason();
        break;
        case 3:
            hinga.addCategory();
            break;
        case 4:
            hinga.addPlant();
        case 5:
            
            
            break;
        case 6:
           System.exit(0);
            break;
        
        default:
        
        }
   
   
   System.out.println("Ushaka kongera kwinjiza akandi karere andika 1 gukomeza kanda 0");
   int districtchoice=scanner.nextInt();
   switch(districtchoice) {
  case 1:
   hinga.addDistrict();
    break;
  case 0:
    System.out.println("Tugiye kwinjiza data z'igihembwe kihinga");
    hinga.addSeason();
    System.out.println("Ushaka kongera kwinjiza ikindi gihembwe kihinga andika 1 gukomeza kanda 0");
    int seasonCoice=scanner.nextInt();
     switch(seasonCoice) {
  case 1:
    hinga.addSeason();
    break;
  case 0:
      System.out.println("Tugiye kwinjiza data z'ubwoko bw'igihingwa");
      hinga.addCategory();
      System.out.println("Tugiye kwinjiza data z'igihingwa");
      hinga.addPlant();
      break;
      default:
    // code block
}
  
      
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
    public void addSeason(){
        Scanner scanner = new Scanner(System.in);
    
    String name;
    float temperature,altitude,humidity,avgwaterSoil;
    System.out.println("Injiza izina ry'igihembwe kihinga");
    name=scanner.nextLine();
    System.out.println("injiza ubushuhe bw'igihembwe(urugero:34.6)");
    temperature=scanner.nextFloat();
   System.out.println("injiza ubutumburuke bw'igihembwe(urugero:34.6)");
   altitude=scanner.nextFloat();
   System.out.println("injiza ingano yamazi mubutaka muri season  (urugero:34.6)");
   avgwaterSoil=scanner.nextFloat();
    System.out.println("injiza humidity  (urugero:34.6)");
   humidity=scanner.nextFloat();
    Season sea=new Season(name,temperature,avgwaterSoil,humidity,altitude);
    season.put(name, sea);
    
    }
    
    public void addCategory(){
        Scanner scanner = new Scanner(System.in);
    
    String name;
    float altitude,humidity;
    System.out.println("Injiza izina ry'ubwoko bw'ihinga");
    name=scanner.nextLine();
   System.out.println("injiza ubutumburuke bw'ubwoko bwigihingwa(urugero:34.6)");
   altitude=scanner.nextFloat();
   System.out.println("injiza humidity yubwoko bwigihingwa (urugero:34.6)");
   humidity=scanner.nextFloat();
   Category cat=new Category(name,humidity,altitude);
   category.put(name, cat);
    }
    public void addPlant(){
        Scanner scanner = new Scanner(System.in);
    
    String name,cat_name;
     float temperature,avgwaterSoil;
     System.out.println("Injiza izina ry'igihingwa");
     name=scanner.nextLine();
      System.out.println("injiza ubushuhe igihingwa gikenera(urugero:34.6)");
    temperature=scanner.nextFloat();
         System.out.println("injiza ingano yamazi mubutaka igihingwa gikenera (urugero:34.6)");
   avgwaterSoil=scanner.nextFloat();
   
    System.out.println("injiza izina ryubwoko igihingwa kibarizwamo (ibinyamafufu)");
   cat_name=scanner.nextLine();
   Category cat=category.get(cat_name);
   
   Igihingwa igih=new Igihingwa(cat.getName(),cat.getHumidity(),cat.getAltitude(),name,avgwaterSoil,temperature);
    igihingwa.put(name, igih);
    }
    
    
    public void AnalyzeUmuhinzi(){
         for (String j : igihingwa.keySet()) {
            Category cat=category.get(igihingwa.get(j).category_name);
            
         }
    }
}
