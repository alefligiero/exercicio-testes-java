package br.com.alefligiero.tests.factory;

import br.com.alefligiero.entities.Financing;

public class FinancingFactory {

    public static Financing createValidFinancing() {
        return new Financing(100000.0, 2000.0, 80);
    }

    public static Financing createNotValidFinancing() {
        return new Financing(100000.0, 2000.0, 20);
    }
}
