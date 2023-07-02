package Transactions;

import Bank.BCR;
import Bank.TypeOfTransaction;

public class BCRServiceImpl implements BCRService{

    public BCRServiceImpl(){
    }

    public void trimiteBani(BCR bcr){
        System.out.println("Sucursala" + bcr.getSucursala());
    }

    public void identificareTransfer(String sucursala, String personA, int lT, boolean isAreComision, TypeOfTransaction typeOfTransaction){
        System.out.println("Transferul se face de la sucursala " + sucursala +
                " catre/ de catre " + personA +
                " unde limita de tranzactie e "+ lT +
                " e comisionat " + isAreComision +
                " iar tipul de tranzactie e " + typeOfTransaction);
    }
}
