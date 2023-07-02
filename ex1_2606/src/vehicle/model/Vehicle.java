package vehicle.model;

public abstract class Vehicle{

    private boolean motor;
    private String caroserie;
    private String geamuri;
    private double caiPutere;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public String getCaroserie() {
        return caroserie;
    }

    public void setCaroserie(String caroserie) {
        this.caroserie = caroserie;
    }

    public String getGeamuri() {
        return geamuri;
    }

    public void setGeamuri(String geamuri) {
        this.geamuri = geamuri;
    }

    public double getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(double caiPutere) {
        this.caiPutere = caiPutere;
    }

    abstract void travel(VehicleRoadType var1);
}
