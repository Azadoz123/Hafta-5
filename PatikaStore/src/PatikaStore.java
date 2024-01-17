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

            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scan.nextInt();

            while (selection){
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.runMenu();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.
            }
        }
    }
}
