package bean.service;

import bean.Product;
private Map<Long, Product> products=DatabaseClass.getProduct();

public class ProductService {
	
	products.put(1L, new Product(1L,"TV",30000F));
    products.put(2L, new Product(2L,"Laptop",50000F));
    products.put(3L, new Product(3L,"DeskTopComputer",35000F));

public List<Product> getAllProducts() {

    return new ArrayList<Product>(products.values());
}
public Product getProduct(long pid) {

    return products.get(pid);
}
public Product addProduct(Product product) {
    product.setPid(products.size()+1);
    products.put(product.getPid(), product);
    return product;
}
public Product updateProduct(Product product) {
    if(product.getPid()<=0)
    {
        return null;
    }
    products.put(product.getPid(), product);
    return product;
}
public Product deleteProduct(long pid) {

    return products.remove(pid);

}
}