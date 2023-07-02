package Bank;

public abstract class Transfer {
    private long Iban;
    private int Shift;

    public long getIban() {
        return Iban;
    }

    public void setIban(long iban) {
        Iban = iban;
    }

    public int getShift() {
        return Shift;
    }

    public void setShift(int shift) {
        Shift = shift;
    }

    abstract void tranzactie(TypeOfTransaction var1);

}
