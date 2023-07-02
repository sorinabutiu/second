package vehicle.service;

import vehicle.model.AirVehicle;
import vehicle.model.EarthVehicle;
import vehicle.model.VehicleRoadType;
import vehicle.model.WaterVehicle;

public class WaterVehicleServiceImpl implements WaterVehicleService{
    public WaterVehicleServiceImpl() {
    }

    public void porneste(WaterVehicle waterVehicle) {
        System.out.println(waterVehicle.isAreIncarcatura() + " porneste ");
    }

    public void identificareVehiculApa(int vitezaDeplasare, boolean areIncarcatura, VehicleRoadType vehicleRoadType) {
        System.out.println("Vehiculul de apa se identifica prin: " + vitezaDeplasare + "si " + vehicleRoadType + "si daca "+ areIncarcatura);
    }
}
