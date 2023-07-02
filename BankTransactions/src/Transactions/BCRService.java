package Transactions;

import Bank.BCR;
import Bank.TypeOfTransaction;

public interface BCRService {
    void trimiteBani(BCR var1);

    void identificareTransfer(String var1, String var2, int var3, boolean var4, TypeOfTransaction var5);
    }
