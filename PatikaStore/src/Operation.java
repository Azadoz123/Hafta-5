public interface Operation<T> {
    void runMenu();
    void showProductList();
    void addProduct();
    void deleteProduct();
    T getProduct(int id);
    void filterByProductId();
    void filterByProductBrand();
}
