package org.example.atm.amountWithdrawalProcessor;

import org.example.atm.Atm;
import org.example.atm.NoteType;

public class OneHundredAmountWithdrawalProcessor extends AmountWithdrawalProcessor {
    public OneHundredAmountWithdrawalProcessor(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    @Override
    public void withDraw(Atm atm, Integer remainingAmount) {
        Integer notes = remainingAmount / NoteType.ONE_HUNDRED.getNoteValue();
        remainingAmount = remainingAmount % NoteType.ONE_HUNDRED.getNoteValue();

        if (notes <= atm.getNotes().get(NoteType.ONE_HUNDRED)) {
            atm.deductNotes(NoteType.ONE_HUNDRED, notes);
        } else {
            remainingAmount += (notes - atm.getNotes().get(NoteType.ONE_HUNDRED)) * NoteType.ONE_HUNDRED.getNoteValue();
            atm.deductNotes(NoteType.ONE_HUNDRED, atm.getNotes().get(NoteType.ONE_HUNDRED));
        }

        if (remainingAmount > 0) {
            super.withDraw(atm, remainingAmount);
        }
    }
}
