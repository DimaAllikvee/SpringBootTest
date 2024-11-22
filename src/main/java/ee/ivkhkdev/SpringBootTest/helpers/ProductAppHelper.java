package ee.ivkhkdev.SpringBootTest.helpers;

import ee.ivkhkdev.SpringBootTest.entities.Product;
import ee.ivkhkdev.SpringBootTest.interfaces.AppHelper;
import org.springframework.stereotype.Component;

@Component
public class ProductAppHelper implements AppHelper<Product> {
    @Override
    public Product create() {
        return new Product();
    }
}
