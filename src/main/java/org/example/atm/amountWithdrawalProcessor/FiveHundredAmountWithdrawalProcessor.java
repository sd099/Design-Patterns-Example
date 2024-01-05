package org.example.atm.amountWithdrawalProcessor;

import org.example.atm.Atm;
import org.example.atm.NoteType;

public class FiveHundredAmountWithdrawalProcessor extends AmountWithdrawalProcessor{

    public FiveHundredAmountWithdrawalProcessor(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    @Override
    public void withDraw(Atm atm, Integer remainingAmount) {
        Integer notes = remainingAmount / NoteType.FIVE_HUNDREDS.getNoteValue();
        remainingAmount = remainingAmount % NoteType.FIVE_HUNDREDS.getNoteValue();

        if (notes <= atm.getNotes().get(NoteType.FIVE_HUNDREDS)) {
            atm.deductNotes(NoteType.FIVE_HUNDREDS, notes);
        } else {
            remainingAmount += (notes - atm.getNotes().get(NoteType.FIVE_HUNDREDS)) * NoteType.FIVE_HUNDREDS.getNoteValue();
            atm.deductNotes(NoteType.FIVE_HUNDREDS, atm.getNotes().get(NoteType.FIVE_HUNDREDS));
        }

        if (remainingAmount > 0) {
            super.withDraw(atm, remainingAmount);
        }
    }
}
