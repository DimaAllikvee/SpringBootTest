package ee.ivkhkdev.SpringBootTest.services;

import ee.ivkhkdev.SpringBootTest.entities.Product;
import ee.ivkhkdev.SpringBootTest.interfaces.AppHelper;
import ee.ivkhkdev.SpringBootTest.interfaces.AppService;
import ee.ivkhkdev.SpringBootTest.interfaces.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements AppService {
    private final AppHelper<Product> productAppHelper;
    private final AppRepository<Product> productRepository;

    @Autowired
    public ProductService(AppHelper<Product> productAppHelper, AppRepository<Product> productRepository) {
        this.productAppHelper = productAppHelper;
        this.productRepository = productRepository;
    }

    @Override
    public boolean add() {
        Product product = productAppHelper.create();
        if (product == null) {
            return false;
        }
        return productRepository.save(product);
    }
}
