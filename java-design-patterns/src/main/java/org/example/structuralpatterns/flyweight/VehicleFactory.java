package org.example.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

// 1 vehicle per color
public class VehicleFactory {
    private static Map<String, Vehicle> vehicleColorCache = new HashMap<>();

    public static Vehicle createVehicle(String color){
        Vehicle newVehicle = vehicleColorCache.computeIfAbsent(color, newColor -> {
            Engine engine = new Engine();
            return new Car(engine, newColor);
        });
        return newVehicle;
    }
}
