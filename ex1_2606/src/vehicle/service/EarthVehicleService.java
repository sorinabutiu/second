package vehicle.service;

import vehicle.model.EarthVehicle;
import vehicle.model.VehicleRoadType;
import vehicle.model.WaterVehicle;

public interface EarthVehicleService {
        void porneste(EarthVehicle var1);

        void identificareAutoVehicul(int var1, int var2, boolean var3, VehicleRoadType var4);
    }
