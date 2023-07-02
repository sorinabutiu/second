package vehicle.service;

import vehicle.model.EarthVehicle;
import vehicle.model.VehicleRoadType;
import vehicle.model.WaterVehicle;

public class EarthVehicleServiceImpl implements EarthVehicleService{
    public EarthVehicleServiceImpl() {
    }

    public void porneste(WaterVehicle waterVehicle) {
        System.out.println(waterVehicle.isAreIncarcatura() + " porneste ");
    }

    public void identificareAutoVehicul(int vitezaDeplasare, boolean areIncarcatura, VehicleRoadType vehicleRoadType) {
        System.out.println("Autovehiculul se identifica prin: " + vitezaDeplasare + "si " + vehicleRoadType + "si daca " + areIncarcatura);
    }

    @Override
    public void porneste(EarthVehicle var1) {

    }

    @Override
    public void identificareAutoVehicul(int var1, int var2, boolean var3, VehicleRoadType var4) {

    }
}
