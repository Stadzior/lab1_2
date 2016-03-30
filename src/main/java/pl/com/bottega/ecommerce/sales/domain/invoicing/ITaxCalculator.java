package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Kamil on 2016-03-30.
 */
public interface ITaxCalculator {
    Money calculate(RequestItem item);
}
