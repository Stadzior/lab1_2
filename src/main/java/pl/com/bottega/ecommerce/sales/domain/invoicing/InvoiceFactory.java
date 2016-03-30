package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 * Created by Kamil on 2016-03-30.
 */
public class InvoiceFactory {
    public static Invoice create(ClientData client){
        return new Invoice(Id.generate(), client);
    }
}
