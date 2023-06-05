package br.com.alefligiero.tests.entities;

import br.com.alefligiero.entities.Financing;
import br.com.alefligiero.tests.factory.FinancingFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void ConstructorShouldCreateObjectsWhenDataIsValid() {
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertEquals(100000.0, financing.getTotalAmount() );
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void ConstructorShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Financing financing = FinancingFactory.createNotValidFinancing();
        });
    }

    @Test
    public void setTotalAmountShouldUpdateValueWhenDataIsValid() {
        Financing financing = FinancingFactory.createValidFinancing();
        financing.setTotalAmount(800.0);
        Assertions.assertEquals(800, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.createValidFinancing();
            financing.setTotalAmount(200000.0);
        });
    }

    @Test
    public void setIncomeShouldUpdateValueWhenDataIsValid() {
        Financing financing = FinancingFactory.createValidFinancing();
        financing.setIncome(4000.0);
        Assertions.assertEquals(4000.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentoExceptionWhenDataIsNotValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Financing financing = FinancingFactory.createValidFinancing();
           financing.setIncome(100.0);
        });
    }

    @Test
    public void setMonthsShouldUpdateValueWhenDataIsValid() {
        Financing financing = FinancingFactory.createValidFinancing();
        financing.setMonths(100);
        Assertions.assertEquals(100, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Financing financing = FinancingFactory.createValidFinancing();
           financing.setMonths(20);
        });
    }

    @Test
    public void entryShouldCalculateValueCorrectly() {
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldCalculateValueCorrectly() {
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertEquals(1000.0, financing.quota());
    }
}
