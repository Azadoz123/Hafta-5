import java.util.Scanner;

public class PatikaStore {
    Scanner scan = new Scanner(System.in);
    boolean isRunning = true;

    public void run(){
        while (isRunning){
            System.out.println("Patika Store Yönetim Paneli");
            System.out.println("1- Notebook İşlemleri\n" +
                    "2- Cep Telefonu İşlemleri\n" +
                    "3- Markaları Listeleme\n" +
                    "0- Çıkış Yap");

            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scan.nextInt();
            //Yapılacak işlem seçimi
            switch (selection){
                //Programı kapat
                case 0:
                    isRunning = false;
                    break;
                    //Notebook işlemleri
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                    //Telefon işlemleri
                case 2:
                    Phone phone = new Phone();
                    phone.runMenu();
                    break;
                    //Marka listeleme
                case 3:
                    Brand brand = new Brand();
                  //  Brand.brandList
                    brand.printBrand();
                    break;
                default :
                    System.out.println("Hatalı değer girdiniz.");
            }
        }
        System.out.println("Program sonlandırılmıştır. Güle güle.");
    }
}
