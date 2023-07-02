import Bank.BCR;
import Bank.BT;
import Bank.PersoanaA;
import Bank.TypeOfTransaction;
import Transactions.BCRService;
import Transactions.BCRServiceImpl;
import Transactions.BTService;
import Transactions.BTServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static Bank.TypeOfTransaction.ATM;
import static Bank.TypeOfTransaction.CHECK;

public class Main {
    public static void main(String[] args) {

        Integer a = 1000;
        Integer b = 200;
        Integer c = 600;


        List<Integer> sumaInitialaCont = new LinkedList<>();
        sumaInitialaCont.add(a);
        sumaInitialaCont.add(b);

        System.out.println("Suma initiala cont [persoana A, persoana B]: " + sumaInitialaCont);

        List<Integer> sumaDupaTransferA = new LinkedList<>();
        sumaDupaTransferA.add(a);

        List<Integer> sumaDupaTransferB = new LinkedList<>();
        sumaDupaTransferB.add(b);

        Collections.replaceAll((sumaDupaTransferA), 1000, 500);
        System.out.println("Suma dupa transfer persoana A: " + sumaDupaTransferA);
        Collections.replaceAll((sumaDupaTransferB), 200, 700);
        System.out.println("Suma dupa transfer persoana B: " + sumaDupaTransferB);

        sumaDupaTransferB.replaceAll((e -> b));
        System.out.println("Suma persoana B dupa retragere ATM: " + b);

        int soldDepozitBancarB = b - b;
        System.out.println("Sold persoana B dupa depozit bancar: " + soldDepozitBancarB);

        sumaDupaTransferB.replaceAll((e -> a));
        System.out.println("Suma persoana B dupa adaugare: " + a);

        Integer x = 400;
        Integer y = 1100;

        List<Integer> noulSoldAB = new ArrayList<>();
        noulSoldAB.add(x);
        noulSoldAB.add(y);

        Collections.reverse(noulSoldAB);
        System.out.println("Sold nou persoana A, persoana B: " + noulSoldAB);

        if (y <= 0) {
            System.out.println("Transferul nu mai e posibil, sold 0");
        } else {
            System.out.println("Sold curent persoana A: " + y);
        }

        BT bt = new BT();
        bt.setPersonB("Andrei");
        bt.isEstePersoanaFizica();
        bt.setTypeOfTransaction(CHECK);
        BTService btService = new BTServiceImpl();
        btService.transferaBani(bt);
        btService.modTransfer(bt.getPersonB(), true, true, false, bt.getTypeOfTransaction());

    }
}