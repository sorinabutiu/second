package vehicle.service;

import vehicle.model.AirVehicle;
import vehicle.model.VehicleRoadType;
import vehicle.model.WaterVehicle;

public interface WaterVehicleService {
    void porneste(WaterVehicle var1);

    void identificareVehiculApa(int var1, boolean var2, VehicleRoadType var3);
}
