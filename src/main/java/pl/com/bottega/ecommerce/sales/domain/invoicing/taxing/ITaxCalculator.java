package pl.com.bottega.ecommerce.sales.domain.invoicing.taxing;

import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Kamil on 2016-03-30.
 */
public interface ITaxCalculator {
    Money calculate(RequestItem item);
}
