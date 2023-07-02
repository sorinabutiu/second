package Bank;

public class BCR extends Transfer{
    private String Sucursala;

    private String personA;
    private int lT;
    private boolean isAreComision;
    private TypeOfTransaction typeOfTransaction;

    public String getSucursala() {
        return Sucursala;
    }

    public void setSucursala(String sucursala) {
        Sucursala = sucursala;
    }

    public String getPersonA() {
        return personA;
    }

    public void setPersonA(String personA) {
        this.personA = personA;
    }

    public int getlT() {
        return lT;
    }

    public void setlT(int lT) {
        this.lT = lT;
    }

    public boolean isAreComision() {
        return isAreComision;
    }

    public void setAreComision(boolean areComision) {
        isAreComision = areComision;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    @Override
    public void tranzactie(TypeOfTransaction typeOfTransaction){
        if(typeOfTransaction.equals(TypeOfTransaction.CHECK)){
            System.out.println("Check transfer BCR");
        }
        else{
            System.out.println("Check transfer BT");
        }
}
}
