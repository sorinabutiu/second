package Bank;

public class BT extends Transfer{

    private String personB;
    private boolean estePersoanaFizica;
    private boolean areDateleActualizate;
    private boolean areComision;
    private TypeOfTransaction typeOfTransaction;

    public String getPersonB() {
        return personB;
    }

    public void setPersonB(String personB) {
        this.personB = personB;
    }

    public boolean isEstePersoanaFizica() {
        return estePersoanaFizica;
    }

    public void setEstePersoanaFizica(boolean estePersoanaFizica) {
        this.estePersoanaFizica = estePersoanaFizica;
    }

    public boolean isAreDateleActualizate() {
        return areDateleActualizate;
    }

    public void setAreDateleActualizate(boolean areDateleActualizate) {
        this.areDateleActualizate = areDateleActualizate;
    }

    public boolean isAreComision() {
        return areComision;
    }

    public void setAreComision(boolean areComision) {
        this.areComision = areComision;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    @Override
    public void tranzactie(TypeOfTransaction typeOfTransaction){
        if(typeOfTransaction.equals(TypeOfTransaction.ATM)){
            System.out.println("Transfer ATM BCR");
        }
        else{
            System.out.println("Transfer ATM BT");
        }
    }
    }
