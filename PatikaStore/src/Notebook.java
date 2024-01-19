import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product implements Operation<Notebook>{

    List<Notebook> notebookList = new ArrayList<>();
    public Notebook() {
    }

    public Notebook(int id, String name, Double price, Double discounRate, int stock, String brandName, int ram, String screenSize, String memory) {
        super(id, name, price, discounRate, stock, brandName, ram, screenSize, memory);
    }

    @Override
    public void runMenu() {

        boolean isRunning = true;
//Notebook Yönetim paneli
            while (isRunning){
                System.out.println("Notebook İşlemleri Yönetim Paneli");
                System.out.println("1- Ürünleri Listele\n" +
                        "2- Ürün Ekle\n" +
                        "3- Ürün Sil\n" +
                        "4- Markaya Göre Ürün Filtrele\n" +
                        "5- Id'ye göre Göre Ürün Filtrele\n" +
                        "6- Markaları Listeleme\n" +
                        "0- Çıkış Yap");

                System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                int selection = scan.nextInt();
                switch (selection){
                    case 0:
                        isRunning = false;
                        break;
                    case 1:
                        showProductList();
                        break;
                    case 2:
                        addProduct();
                        break;
                    case 3:
                        deleteProduct();
                        break;
                    case 4:
                        filterByProductBrand();
                        break;
                    case  5:
                        filterByProductId();
                        break;
                    case 6:
                        Brand brand = new Brand();
                        //  Brand.brandList
                        brand.printBrand();
                        break;
                    default :
                        System.out.println("Hatalı değer girdiniz.");
            }
        }
    }

    @Override
    public void showProductList() {
        System.out.println("ID | Ürün Adı | Fiyat | Marka | Depolama | Ekran | RAM");
        for(Notebook notebook : notebookList){
            System.out.println(notebook.getId() + " "
                    + notebook.getName() + " "
                    + notebook.getPrice() + " "
                    + notebook.getBrandName() + " "
                    + notebook.getMemory()+ " "
                    + notebook.getScreenSize() + " "
                    + notebook.getRam());
        }
        System.out.println();
    }

    @Override
  //  public void addProduct(Notebook notebook) {
    //ürün ekleme
    public void addProduct() {
    //    Notebook notebook = new Notebook(1,"Huawei Matebook 14", 7000.0, 0.0, 1, "Huawei", 512, "14.0", "16 GB");
    //    Notebook notebook1 = new Notebook(2,"Huawei Matebook 14", 7000.0, 0.0, 1, "Huawei", 512, "14.0", "16 GB");
    //    Notebook notebook2 = new Notebook(3,"Huawei Matebook 14", 7000.0, 0.0, 1, "Lenova", 512, "14.0", "16 GB");
        Notebook notebook = new Notebook();
        System.out.print("Ürün Id : ");
        notebook.setId(scan.nextInt()) ;
        System.out.print("Adı : ");
        notebook.setName(scan.next()); ;
        System.out.print("Fiyat : " );
        notebook.setPrice(scan.nextDouble());
        System.out.print("İndirm Oranı : " );
        notebook.setDiscounRate(scan.nextDouble());
        System.out.print("Stok : ");
        notebook.setStock(scan.nextInt());
        System.out.print("Marka : " );
        notebook.setBrandName(scan.next());
        System.out.print("RAM : " );
        notebook.setRam(scan.nextInt());
        System.out.print("Ekran : "  );
        notebook.setScreenSize(scan.next());
        System.out.print("Hafıza : "  );
        notebook.setMemory(scan.next());
        notebookList.add(notebook);
  //      notebookList.add(notebook1);
   //     notebookList.add(notebook2);
    }
//ürün silme
    @Override
    public void deleteProduct() {
        showProductList();
        System.out.print("Silmek istediğiniz ürünün Id'sini giriniz : ");
        int id = scan.nextInt();
        Notebook notebook = getProduct(id);
        notebookList.remove(notebook);
    }
//ürün getirme
    @Override
    public Notebook getProduct(int id) {
        for (Notebook notebook : notebookList){
            if(notebook.getId() == id)
                return notebook;
        }
        return null;
    }

//id'ye göre ürün filtreleme
    @Override
    public void filterByProductId() {
        System.out.print("Getirmek istediğinz ürünü ID'sini girniz : ");
        int id = scan.nextInt();
        for (Notebook notebook : notebookList){
            if(notebook.getId() == id){
                System.out.println(notebook.getId() + " "
                        + notebook.getName() + " "
                        + notebook.getPrice() + " "
                        + notebook.getBrandName() + " "
                        + notebook.getMemory()+ " "
                        + notebook.getScreenSize() + " "
                        + notebook.getRam());
          }
        }
        System.out.println();
    }
//markaya göre ürün filtreleme
    @Override
    public void filterByProductBrand() {
        List<Notebook> newNotebookList = new ArrayList<>();
        System.out.print("Hangi marka ürünleri listelemek istiyorsunuz : ");
        String marka = scan.next();
        for (Notebook notebook : notebookList){
            if(notebook.getBrandName().equals(marka)) {
                newNotebookList.add(notebook);
            }
        }
      //  return newNotebookList;
        for(Notebook notebook : newNotebookList){
            System.out.println(notebook.getId() + " "
                    + notebook.getName() + " "
                    + notebook.getPrice() + " "
                    + notebook.getBrandName() + " "
                    + notebook.getMemory()+ " "
                    + notebook.getScreenSize() + " "
                    + notebook.getRam());
        }
        System.out.println();
    }

}
