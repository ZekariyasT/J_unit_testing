
package UNIT;


public class Conversion {
    
    public double centimetertometer(double cm){
        return cm/100;
        
    }
    public double metertocentimeter(double m){
        return m*100;
        
    }
    public double metertokilometer(double m){
        return m/1000;
        
    }
     public double kilometertometer(double km){
        return km*1000;
        
    }
     public double foottoinch(double foot){
         return foot*12;
     }
     public double inchtofoot(double inch){
         return inch/12;
     }
    
    public static void main(String[] args)
    {
        Conversion change=new Conversion();
      
    }
}
