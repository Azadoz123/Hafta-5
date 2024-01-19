import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;
    public static int idCounter = 0;
//markaları depoda tutma
    public static TreeSet<Brand> brandList = new TreeSet<>();

    public Brand() {
    }

    public Brand(String name) {
        this.id = ++idCounter;
        this.name = name;
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
//markaları ekleme
    static {
        brandList.add(new Brand("Samsung"));
        brandList.add(new Brand("Lenova"));
        brandList.add(new Brand("Apple"));
        brandList.add(new Brand("Huawei"));
        brandList.add(new Brand("Casper"));
        brandList.add(new Brand("Asus"));
        brandList.add(new Brand("HP"));
        brandList.add(new Brand("Xiaomi"));
        brandList.add(new Brand("Monster"));

    }
    @Override
    public int compareTo(Brand o) {
       return this.name.compareTo(o.getName());
    }
//markaları listeleme
    public void printBrand() {
        for (Brand brand: brandList){
            System.out.println("- " + brand.getName());
        }
    }
}
