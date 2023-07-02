package vehicle.service;

import vehicle.model.AirVehicle;
import vehicle.model.VehicleRoadType;

public class VehicolAerServiceImpl implements VehicolAerService {
    public VehicolAerServiceImpl() {
    }

    public void decoleaza(AirVehicle airVehicle) {
        System.out.println(airVehicle.isMotorReactie() + " Decoleaza ");
    }

    public void identificareAeronava(boolean motorReactie, int numarMotoare, VehicleRoadType vehicleRoadType) {
        System.out.println("Aeronava se identifica prin: " + motorReactie + "si " + vehicleRoadType + "si " + numarMotoare);

    }
}
