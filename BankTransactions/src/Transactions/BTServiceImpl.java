package Transactions;

import Bank.BT;
import Bank.TypeOfTransaction;

public class BTServiceImpl implements BTService{

    public BTServiceImpl(){
    }

    public void transferaBani(BT bt){
        System.out.println(bt.isEstePersoanaFizica() + "Persoana fizica");
    }

    public void modTransfer(String personB, boolean persoanaFizica, boolean areDateleActualizate, boolean areComision, TypeOfTransaction typeOfTransaction){
        System.out.println(personB + "Persoana fizica " + persoanaFizica +
                " are datele in sistem actualizate " + areDateleActualizate +
                " transferul se comisioneaza " + areComision +
                " tip de tranzactie " +typeOfTransaction);
    }

}
