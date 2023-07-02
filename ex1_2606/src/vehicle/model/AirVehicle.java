package vehicle.model;

public class AirVehicle extends Vehicle {

    private boolean motorReactie;

    private int nrMotoare;

    private VehicleRoadType vehicleRoadType;



    public boolean isMotorReactie() {
        return this.motorReactie;
    }

    public void setMotorReactie(boolean motorReactie) {
        this.motorReactie = motorReactie;
    }
    public int getNrMotoare() {
        return nrMotoare;
    }

    public void setNrMotoare(int nrMotoare) {
        this.nrMotoare = nrMotoare;
    }

    public VehicleRoadType getVehicleRoadType() {
        return vehicleRoadType;
    }

    public void setVehicleRoadType(VehicleRoadType vehicleRoadType) {
        this.vehicleRoadType = vehicleRoadType;
    }

    @Override
    public void travel(VehicleRoadType vehicleRoadType) {
        if (vehicleRoadType.equals(VehicleRoadType.AIR)) {
            System.out.println("Travel by air");
        }
        else{
            System.out.println("Not air vehicle");
        }
    }
}