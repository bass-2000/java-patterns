package ru.bass2000.patterns.chain_of_responsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}