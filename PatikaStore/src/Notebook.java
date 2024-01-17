public class Notebook extends Product implements Operation{

    public Notebook() {
    }

    public Notebook(int id, String name, Double price, Double discounRate, int stock, String brandName, int ram, String screenSize, String memory) {
        super(id, name, price, discounRate, stock, brandName, ram, screenSize, memory);
    }

    @Override
    public void runMenu() {

    }

    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }
}
