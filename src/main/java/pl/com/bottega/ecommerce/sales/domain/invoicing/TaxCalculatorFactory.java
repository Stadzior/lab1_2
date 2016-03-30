package pl.com.bottega.ecommerce.sales.domain.invoicing;

/**
 * Created by Kamil on 2016-03-30.
 */
public class TaxCalculatorFactory {
    public ITaxCalculator create(){
        return new TaxCalculator();
    }
}
