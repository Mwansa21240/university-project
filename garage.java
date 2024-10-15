package garage2;

import java.util.HashMap;
import java.util.Map;
public class garage {

    // Car parts map
    public static Map<String, String> carPartsMap = new HashMap<>();

    // Load parts into the carPartsMap
    public static void fordParts() {
        // Engine Map
        Map<String, String> _EngineMap = new HashMap<>();
        _EngineMap.put("1881-0AB10", "Engine Air Filter");
        _EngineMap.put("999-YSSDA", "Oil Filter");
        _EngineMap.put("0919-04347", "Spark Plug");
        _EngineMap.put("135Bf-0900", "Timing Belt");
        _EngineMap.put("161AA-215", "Water Pump");

        // Transmission Map
        Map<String, String> _TransmissionMap = new HashMap<>();
        _TransmissionMap.put("3N3X0-63310", "Transmission Fluid Filter");
        _TransmissionMap.put("3M168-5S1P", "Transmission Pan Gasket");
        _TransmissionMap.put("31BC0-3206", "Clutch Disc");
        _TransmissionMap.put("3BY0-0K00", "Gear Shift Cable");

        // Suspension Map
        Map<String, String> _SuspensionMap = new HashMap<>();
        _SuspensionMap.put("4U51-09T80", "Front Shock Absorber");
        _SuspensionMap.put("48DC1-06HM0", "Rear Coil Spring");
        _SuspensionMap.put("43340-49025", "Ball Joint");
        _SuspensionMap.put("48GJ8-0R00", "Control Arm");

        // Electrical Map
        Map<String, String> _Electrical_Map = new HashMap<>();
        _Electrical_Map.put("2V860-0P00", "Alternator");
        _Electrical_Map.put("28OL00-F010", "Starter Motor");
        _Electrical_Map.put("288-0C0N2", "Battery");
        _Electrical_Map.put("90MI1-1TJ75", "Headlight Bulb");

        // Fuel System Map
        Map<String, String> _FuelSystem = new HashMap<>();
        _FuelSystem.put("230-0XYZ0", "Fuel Pump");
        _FuelSystem.put("2300-0D0M", "Fuel Filter");
        _FuelSystem.put("209-79DND5", "Fuel Injector");

        // Combine all parts into one master map
        carPartsMap.putAll(_EngineMap);
        carPartsMap.putAll(_TransmissionMap);
        carPartsMap.putAll(_SuspensionMap);
        carPartsMap.putAll(_Electrical_Map);
        carPartsMap.putAll(_FuelSystem);
    }

    // Method to search for part by number
    public static String fordsearchPart(String partNumber) {
        return carPartsMap.getOrDefault(partNumber,
         "Part not found");
    }
    
}
