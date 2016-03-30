package pl.com.bottega.ecommerce.sales.domain.invoicing.taxing;

/**
 * Created by Kamil on 2016-03-30.
 */
public class TaxCalculatorFactory {
    public static ITaxCalculator create(){
        return new TaxCalculator();
    }
}
