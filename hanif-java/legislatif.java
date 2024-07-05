
import java.util.*;

public class legislatif {

    public static float suara( float person, float totalPerson){

        float total;
        total = person/totalPerson* 100;

        return total;

            
    }
    public static void main(String[] args) {

        float person;
        float totalPerson;

    Scanner input;

    input = new Scanner(System.in);

   
    System.out.println("masukkan person =");
    person= input.nextFloat();
    System.out.println("masukkan totalPerson =");
    totalPerson = input.nextFloat();
        
      

System.out.println("calon no urut  " + " = "+ suara(person,totalPerson) + "%");
     
    }
    
}

