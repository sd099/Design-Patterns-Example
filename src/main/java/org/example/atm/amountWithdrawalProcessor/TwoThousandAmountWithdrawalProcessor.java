package org.example.atm.amountWithdrawalProcessor;

import org.example.atm.Atm;
import org.example.atm.NoteType;

public class TwoThousandAmountWithdrawalProcessor extends AmountWithdrawalProcessor{

    public TwoThousandAmountWithdrawalProcessor(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    @Override
    public void withDraw(Atm atm, Integer remainingAmount) {
        Integer notes = remainingAmount / NoteType.TWO_THOUSANDS.getNoteValue();
        remainingAmount = remainingAmount % NoteType.TWO_THOUSANDS.getNoteValue();

        if (notes <= atm.getNotes().get(NoteType.TWO_THOUSANDS)) {
            atm.deductNotes(NoteType.TWO_THOUSANDS, notes);
        } else {
            remainingAmount += (notes - atm.getNotes().get(NoteType.TWO_THOUSANDS)) * NoteType.TWO_THOUSANDS.getNoteValue();
            atm.deductNotes(NoteType.TWO_THOUSANDS, atm.getNotes().get(NoteType.TWO_THOUSANDS));
        }

        if (remainingAmount > 0) {
            super.withDraw(atm, remainingAmount);
        }
    }
}
