import vehicle.model.AirVehicle;
import vehicle.model.EarthVehicle;
import vehicle.model.VehicleRoadType;
import vehicle.model.WaterVehicle;
import vehicle.service.VehicolAerService;
import vehicle.service.VehicolAerServiceImpl;
import vehicle.service.WaterVehicleService;
import vehicle.service.WaterVehicleServiceImpl;

import static vehicle.model.VehicleRoadType.AIR;

public class Main {
    public Main(){

    }
    public static void main(String[] args) {

        //Implementati un concept OOP cu interfete, clase abstracte a tuturor mijloacelor de transport(apa, pamant, aer)
        //fiecare cu caracteristicile lui

        AirVehicle avion = new AirVehicle();
        avion.setMotorReactie(true);
        avion.setNrMotoare(5);
        avion.setVehicleRoadType(VehicleRoadType.AIR);
        avion.travel(VehicleRoadType.WATER);
        VehicolAerService vehiculAerService = new VehicolAerServiceImpl();
        vehiculAerService.decoleaza(avion);
        vehiculAerService.identificareAeronava(avion.isMotorReactie(), avion.getNrMotoare(), avion.getVehicleRoadType());

        WaterVehicle vapor=new WaterVehicle();
        vapor.setAreIncarcatura(true);
        vapor.setVehicleRoadType(VehicleRoadType.WATER);
        WaterVehicleService waterVehicleService = new WaterVehicleServiceImpl();
        waterVehicleService.porneste(vapor);
        waterVehicleService.identificareVehiculApa(vapor.getVitezaDeplasare(), vapor.isAreIncarcatura(), vapor.getVehicleRoadType());

        EarthVehicle masina = new EarthVehicle();
        masina.setAreInspectia(false);
        masina.setVehicleRoadType(VehicleRoadType.EARTH);

        }
    }