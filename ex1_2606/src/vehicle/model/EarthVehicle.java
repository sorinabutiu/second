package vehicle.model;

public class EarthVehicle extends Vehicle{
    private int NrRoti;
    private int vitezaMaxima;
    private boolean areInspectia;
    private VehicleRoadType vehicleRoadType;

    public int getNrRoti() {
        return NrRoti;
    }

    public void setNrRoti(int nrRoti) {
        NrRoti = nrRoti;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public boolean isAreInspectia() {
        return areInspectia;
    }

    public void setAreInspectia(boolean areInspectia) {
        this.areInspectia = areInspectia;
    }

    public VehicleRoadType getVehicleRoadType() {
        return vehicleRoadType;
    }

    public void setVehicleRoadType(VehicleRoadType vehicleRoadType) {
        this.vehicleRoadType = vehicleRoadType;
    }

    @Override
    public void travel(VehicleRoadType vehicleRoadType) {
        if (vehicleRoadType.equals(VehicleRoadType.EARTH)) {
            System.out.println("Travel by earth");
        }
        else{
            System.out.println("Not earth vehicle");
        }
    }
}
