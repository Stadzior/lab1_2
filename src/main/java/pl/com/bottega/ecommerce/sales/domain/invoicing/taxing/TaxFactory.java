package pl.com.bottega.ecommerce.sales.domain.invoicing.taxing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Kamil on 2016-03-30.
 */
public class TaxFactory {
    public static Tax create(Money amount,String description) {
        return new Tax(amount, description);
    }
}
