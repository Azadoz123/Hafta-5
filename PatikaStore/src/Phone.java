public class Phone extends Product implements Operation<Phone>{
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
        System.out.println("Phone running");
    }

    @Override
    public void showProductList() {

    }

    @Override
 //   public void addProduct(Phone phone) {
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public Phone getProduct(int id) {
        return null;
    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }
}
