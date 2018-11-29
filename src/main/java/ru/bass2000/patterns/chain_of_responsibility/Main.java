package ru.bass2000.patterns.chain_of_responsibility;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);
    private final Scanner scanner;
    private DispenseChain c1;

    public Main(Scanner scanner) {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        logger.info("Chain of Responsibility pattern");
        Main atmDispenser = new Main(new Scanner(System.in));
        dispense(atmDispenser.getScanner(), atmDispenser.getC1());

    }

    public static void dispense(Scanner scanner, DispenseChain c1) {
        int amount = 0;
        logger.info("\nEnter amount to dispense");
        amount = scanner.nextInt();
        if (amount % 10 != 0) {
            logger.info("Amount should be in multiple of 10s.");
            return;
        }
        // process the request
        c1.dispense(new Currency(amount));
    }

    public Scanner getScanner() {
        return scanner;
    }

    public DispenseChain getC1() {
        return c1;
    }

}
