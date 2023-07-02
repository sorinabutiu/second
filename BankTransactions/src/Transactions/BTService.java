package Transactions;

import Bank.BT;
import Bank.TypeOfTransaction;

public interface BTService {
    void transferaBani(BT var1);

    void modTransfer(String var1, boolean var2, boolean var3, boolean var4, TypeOfTransaction var5);
}
