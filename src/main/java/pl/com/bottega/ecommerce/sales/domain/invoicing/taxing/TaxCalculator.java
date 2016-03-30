package pl.com.bottega.ecommerce.sales.domain.invoicing.taxing;

import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;
import pl.com.bottega.ecommerce.sharedkernel.Money;
import java.math.BigDecimal;

/**
 * Created by Kamil on 2016-03-30.
 */
public class TaxCalculator implements ITaxCalculator {
    public Tax calculate(RequestItem item) throws IllegalArgumentException{
        Money net = item.getTotalCost();
        BigDecimal ratio = null;
        String desc = null;

        switch (item.getProductData().getType()) {
            case DRUG:
                ratio = BigDecimal.valueOf(0.05);
                desc = "5% (D)";
                break;
            case FOOD:
                ratio = BigDecimal.valueOf(0.07);
                desc = "7% (F)";
                break;
            case STANDARD:
                ratio = BigDecimal.valueOf(0.23);
                desc = "23%";
                break;

            default:
                throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
        }

        return TaxFactory.create(net.multiplyBy(ratio),desc);
    }
}
