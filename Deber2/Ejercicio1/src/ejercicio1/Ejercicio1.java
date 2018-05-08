
package ejercicio1;
import java.util.*;

public class Ejercicio1 {

    private String name;
    private String type;
    private double prize;
    private String content;
    private Date creationDate;
    
    public Ejercicio1(){
    
    }
    
    public Ejercicio1( String name, int year, int month, int day ){
        this.name = name;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.creationDate = calendar.getTime();
        
    }
    
    
    //setters
    public void setName(String name){
        this.name = name;
        
    }
    public String getName(){
        
        return this.name;
    }
    
    //
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    //
    public void setCreationDate(int year, int month, int day){
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.creationDate = calendar.getTime();
    }
    
    public Date getCeartionDate(){
        
    return this.creationDate;    
    } 
    
    public void setContent(String content){
        this.content = content;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public static void main(String[] args) {
        // TODO ejercicio1
        Ejercicio1 pc = new Ejercicio1("mac",1997,01,04 );
      
        Ejercicio1 pc1 = new Ejercicio1();
        Ejercicio1 pc2 = new Ejercicio1();
        Ejercicio1 pc3 = new Ejercicio1();
        
        
        pc1.setName("Josepc");
        pc2.setName("Xvierpc");
        pc3.setName("kevinpc");
        
        pc1.setType("servidor");
        pc2.setType("escritorio");
        pc3.setType("portatil");
        
        pc1.setCreationDate(1990,01,02);
        pc2.setCreationDate(1991,01,03);
        pc3.setCreationDate(1992,01,04);
        
        pc1.setContent("Tarjeta grafica 4k");
        pc2.setContent("intel core i 9");
        pc3.setContent("SO windows 10 pro");
        
        System.out.println("the fist computer´s name is: " + pc1.getName()     );
        System.out.println("The creation date is: " + pc1.getCeartionDate());
        System.out.println("The computer´s type is: " + pc1.getType());
        System.out.println("The computer´s contents are: " + pc1.getContent());
        
        System.out.println("");
        
        System.out.println("the fist computer´s name is: " + pc2.getName()     );
        System.out.println("The creation date is: " + pc2.getCeartionDate());
        System.out.println("The computer´s type is: " + pc2.getType());
        System.out.println("The computer´s contents are: " + pc2.getContent());
        
        System.out.println("");
        
        System.out.println("the fist computer´s name is: " + pc3.getName()     );
        System.out.println("The creation date is: " + pc3.getCeartionDate());
        System.out.println("The computer´s type is: " + pc3.getType());
        System.out.println("The computer´s contents are: " + pc3.getContent());
    }
    
}
