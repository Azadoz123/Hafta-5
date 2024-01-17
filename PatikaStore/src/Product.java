public abstract class  Product  {
    private int id;
    private String name;
    private Double price;
    private Double discounRate;
    private int stock;
    private String brandName;
    private int ram;
    private String screenSize;
    private String memory;

    public Product() {
    }

    public Product(int id, String name, Double price, Double discounRate, int stock, String brandName, int ram, String screenSize, String memory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discounRate = discounRate;
        this.stock = stock;
        this.brandName = brandName;
        this.ram = ram;
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscounRate() {
        return discounRate;
    }

    public void setDiscounRate(Double discounRate) {
        this.discounRate = discounRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
