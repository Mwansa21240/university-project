import garage.garage1;
import garage2.garage;
import garage3.garage3;
import java.util.Scanner;

public class GarageAPP2 {
    public static void main(String[] args) {
        // Load parts from Ford and Toyota into the map
        garage.fordParts();
        garage1.toyotaParts();
        garage3.mercedes_Benzparts();

        try (Scanner scanner = new Scanner(System.in)) {
            //Entering customer details..
            String titleTop ="\t\t\tHello, welcome to DMT Auto Spares..\t\t\t";
            System.out.print(titleTop.toUpperCase());
            System.out.print("\nMay I know your name please: ");

            String username = scanner.nextLine();
            
            System.out.printf("Nice too meet you,%s here is a list of the name of car manufacturer available:\n-Toyota\n-Ford\n-Mercedes-Benz"
            ,username);


            // Get car manufacturer from the user
           // System.out.print("");
            System.out.print("\nEnter car manufacturer: ");
            String manufacturer = scanner.next().toLowerCase();  // Convert to lowercase for easier comparison

            if (manufacturer.equals("toyota")|| manufacturer.equals("ford")|| manufacturer.equals("mercedes-benz")){


                // Get part number from the user
            System.out.print("Enter part number: ");
            String partNumber = scanner.next();

            // Check manufacturer and search in the corresponding map
            switch (manufacturer) {
                case "toyota" -> {
                    String resultToyota = garage1.searchPartToyota(partNumber);
                    System.out.printf("Toyota Part Description: %S is available %s."
                     , resultToyota,username);
                }
                case "ford" -> {
                    String resultFord = garage.fordsearchPart(partNumber);
                    System.out.printf("Ford Part Description: %S  is available %s." 
                    , resultFord,username);
                }
                case "mercedes-benz" ->{
                    String resultMercedes_Benz = garage3.mercedesSearchPart(partNumber);
                    System.out.printf("Merced-Benz Description: %S is avaiable %s", 
                    resultMercedes_Benz,username);
                }
            } 

            // 
                
            }else{
                System.out.printf("%S invalid manufacturer,Please enter either %S."
                ,username,manufacturer);
            }
        }
    }
}
