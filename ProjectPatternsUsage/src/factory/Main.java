package factory;

import factory.marketplace_service.*;

public class Main {
    public static void main(String[] args) {

        Factory factory = new LegalFactory();
        factory.processOrder();
    }
}
