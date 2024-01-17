public class Phone extends Product implements Operation{
    private int camera;
    private int batteryCapacity;
    private String color;

    public Phone() {

    }

    public Phone(int id, String name, Double price, Double discounRate, int stock, String brandName, int ram, String screenSize, String memory, int camera, int batteryCapacity, String color) {
        super(id, name, price, discounRate, stock, brandName, ram, screenSize, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
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
