package org.example.atm.amountWithdrawalProcessor;

import org.example.atm.Atm;

import java.util.Objects;

public abstract class AmountWithdrawalProcessor {
    private AmountWithdrawalProcessor nextAmountWithdrawalProcessor;

    public AmountWithdrawalProcessor(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        this.nextAmountWithdrawalProcessor = amountWithdrawalProcessor;
    }

    public void withDraw(Atm atm, Integer remainingAmount) {
        if (Objects.nonNull(nextAmountWithdrawalProcessor)) {
            nextAmountWithdrawalProcessor.withDraw(atm, remainingAmount);
        }
    }
}
