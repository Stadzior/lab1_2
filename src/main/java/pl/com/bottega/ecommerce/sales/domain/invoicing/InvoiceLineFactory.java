package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.invoicing.taxing.Tax;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Kamil on 2016-03-30.
 */
public class InvoiceLineFactory {
    public static InvoiceLine create(ProductData product, int quantity, Money net, Tax tax) {
        return new InvoiceLine(product, quantity, net, tax);
    }
}
