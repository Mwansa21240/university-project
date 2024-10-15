package garage; // function export package function..
import java.util.HashMap; //Storing of key value pairs..
import java.util.Map;  // Master Hashmap store of key value pairs..

public class garage1 {

    //

    public static Map<String, String> carPartsMaps = new HashMap<>();


    // Load parts into the carPartsMap
    public static void toyotaParts() {
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
        carPartsMaps.putAll(_EngineMap);
        carPartsMaps.putAll(_TransmissionMap);
        carPartsMaps.putAll(_SuspensionMap);
        carPartsMaps.putAll(_Electrical_Map);
        carPartsMaps.putAll(_FuelSystem);
    }
     // Method to search for part by number
     public static String searchPartToyota(String partNumber) {
        return carPartsMaps.getOrDefault(partNumber, "Part not found");
    }
}
