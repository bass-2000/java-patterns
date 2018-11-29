package ru.bass2000.patterns.chain_of_responsibility;

import org.apache.log4j.Logger;

public class Dollar50Dispenser implements DispenseChain {
    final static Logger logger = Logger.getLogger(Dollar50Dispenser.class);
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            logger.info("Dispensing " + num + " 50$ note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }

}
