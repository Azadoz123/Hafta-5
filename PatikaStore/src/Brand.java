import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private int id;
    public String name;
    private static int idCounter;

    public static TreeSet<Brand> brandList = new TreeSet<>();

    public Brand(String name) {
        this.id = idCounter++;
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
        this.name.compareTo(o.getName())
    }
}
