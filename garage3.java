package garage3;

import java.util.HashMap;
import java.util.Map;

public class garage3{
    // Car parts map
    public static Map<String, String> carPartsMap = new HashMap<>();

    //Load parts into carPartsMap
    public static void  mercedes_Benzparts(){
         // Engine Map
        Map<String, String> _EngineMap = new HashMap<>();
        _EngineMap.put("A2711800109", "Oil Filter");
        _EngineMap.put(" A2740940204", "Air Filter");
        _EngineMap.put("A2760700587", "Fuel Injector");
        _EngineMap.put("A2762001301", "Water Pump");
        _EngineMap.put("A2710501700", "Timing Chain");
        _EngineMap.put("A0031595103", "Spark Plugs");
        
        // Transmission Map
        Map<String, String> _TransmissionMap = new HashMap<>();
        _TransmissionMap.put("A2202701400", "Transmission Filter Kit");
        _TransmissionMap.put("A001989680313", "Automatic Transmission Fluid (ATF");
        _TransmissionMap.put("A2122400418", "Transmission Mount");
        _TransmissionMap.put("A2202501702", "Torque Converter");
        _TransmissionMap.put("A0112504902", "Clutch Disc (for manual transmissions");
        _TransmissionMap.put("B0112554932", "Clutch Disc (for Automatic transmissions)");
       
        // Suspension Map
        Map<String, String> _SuspensionMap = new HashMap<>();
        _SuspensionMap.put("A2123200530", "Front Shock Absorber");
        _SuspensionMap.put("A2123202030", "Rear Shock Absorber");
        _SuspensionMap.put("A2213306607", "Control Arm");
        _SuspensionMap.put("A2043201789", "Sway Bar Link");
        _SuspensionMap.put("A2203200104", "Air Suspension Compressor");
        

        // Electrical Map
        Map<String, String> _Electrical_Map = new HashMap<>();
        _Electrical_Map.put("A0009063423", "Alternator");
        _Electrical_Map.put("A0031515801", "Starter Motor");
        _Electrical_Map.put("A0055411001", "Battery");
        _Electrical_Map.put("A2769060160", "Ignition Coil");
        _Electrical_Map.put("A1669009200", "Fuse Box");
        _Electrical_Map.put("A0038209420", "Headlight Bulb (Xenon)");
        // Fuel System Map
        Map<String, String> _FuelSystem = new HashMap<>();
        _FuelSystem.put("A2214701694", "Fuel Pump");
        _FuelSystem.put("A0000901451", "Fuel Filter");
        _FuelSystem.put("A2760700091", "Fuel Pressure Regulator");
        _FuelSystem.put("A2760780149", "Fuel Injector Seal Kit");
        _FuelSystem.put("A0004713301", "Fuel Tank Cap");


        _EngineMap.putAll(_EngineMap);
        _TransmissionMap.putAll(_TransmissionMap);
        _SuspensionMap.putAll(_SuspensionMap);
        _Electrical_Map.putAll(_Electrical_Map);
        _FuelSystem.putAll(_FuelSystem);

    }

    // Method to search for part by number
    public static String mercedesSearchPart(String partNumber) {
        return carPartsMap.getOrDefault(partNumber, "Part not found");
    }
}