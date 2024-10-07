import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class project {
    //Define the carPartsMap at the class level
    public static Map<String, String> carPartsMap = new HashMap<>();


    // Load parts into the carPartsMap
    private static void toyotaParts() {
        // Engine Map
        Map<String, String> _EngineMap = new HashMap<>();
        _EngineMap.put("17801-0P010", "Engine Air Filter");
        _EngineMap.put("90915-YZZD3", "Oil Filter");
        _EngineMap.put("90919-01247", "Spark Plug");
        _EngineMap.put("13568-09070", "Timing Belt");
        _EngineMap.put("16100-29815", "Water Pump");

        // Transmission Map
        Map<String, String> _TransmissionMap = new HashMap<>();
        _TransmissionMap.put("35330-60010", "Transmission Fluid Filter");
        _TransmissionMap.put("35168-50010", "Transmission Pan Gasket");
        _TransmissionMap.put("31250-32060", "Clutch Disc");
        _TransmissionMap.put("33820-0K100", "Gear Shift Cable");

        // Suspension Map
        Map<String, String> _SuspensionMap = new HashMap<>();
        _SuspensionMap.put("48510-09T80", "Front Shock Absorber");
        _SuspensionMap.put("48231-06110", "Rear Coil Spring");
        _SuspensionMap.put("43340-49025", "Ball Joint");
        _SuspensionMap.put("48068-0R010", "Control Arm");

        // Electrical Map
        Map<String, String> _Electrical_Map = new HashMap<>();
        _Electrical_Map.put("27060-0P040", "Alternator");
        _Electrical_Map.put("28100-0F010", "Starter Motor");
        _Electrical_Map.put("28800-0C022", "Battery");
        _Electrical_Map.put("90981-13075", "Headlight Bulb");

        // Fuel System Map
        Map<String, String> _FuelSystem = new HashMap<>();
        _FuelSystem.put("23220-50010", "Fuel Pump");
        _FuelSystem.put("23300-31500", "Fuel Filter");
        _FuelSystem.put("23209-79135", "Fuel Injector");

        // Combine all parts into one master map
        carPartsMap.putAll(_EngineMap);
        carPartsMap.putAll(_TransmissionMap);
        carPartsMap.putAll(_SuspensionMap);
        carPartsMap.putAll(_Electrical_Map);
        carPartsMap.putAll(_FuelSystem);
    }
    

    // Search for a part in carPartsMap
    private static void searchPart(String query) {
        boolean partFound = false;

        for (Map.Entry<String, String> entry : carPartsMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(query) ) {
                System.out.println("\n\t");
                System.out.println("Dear Customer here the your looking for, Part Name: " + entry.getValue());
                //partFound = true;
                break; // Exit loop after finding the first match
            }
            else if (!partFound) {
                System.out.println("Part not found: " + query);
                break;
            }
        }

        
    }

    public static void main(String[] args) {
        toyotaParts(); // Load the parts into the carPartsMap
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Enter Part Id: ");
           String id = scanner.next();
           searchPart(id);
         }
        
    
    }
    
    
}
