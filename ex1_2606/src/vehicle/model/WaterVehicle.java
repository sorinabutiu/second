package vehicle.model;

public class WaterVehicle extends Vehicle{
    private int vitezaDeplasare;
    private boolean areIncarcatura;
    private VehicleRoadType vehicleRoadType;

    public int getVitezaDeplasare() {
        return vitezaDeplasare;
    }

    public void setVitezaDeplasare(int vitezaDeplasare) {
        this.vitezaDeplasare = vitezaDeplasare;
    }

    public boolean isAreIncarcatura() {
        return areIncarcatura;
    }

    public void setAreIncarcatura(boolean areIncarcatura) {
        this.areIncarcatura = areIncarcatura;
    }

    public VehicleRoadType getVehicleRoadType() {
        return vehicleRoadType;
    }

    public void setVehicleRoadType(VehicleRoadType vehicleRoadType) {
        this.vehicleRoadType = vehicleRoadType;
    }
    @Override
    public void travel(VehicleRoadType vehicleRoadType) {
        if (vehicleRoadType.equals(VehicleRoadType.WATER)) {
            System.out.println("Travel by water");
        }
        else{
            System.out.println("Not water vehicle");
        }
    }
}
