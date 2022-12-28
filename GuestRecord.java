import java.util.Scanner;

public class GuestRecord {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int nomortamu = 10;
        for(int i =0; i<10;i++) {
            EventOrganizer tamu = new EventOrganizer();
            System.out.println("Masukan ID : ");
            tamu.setCustId(inputUser.nextInt());

            System.out.println("masukan nama : ");
            tamu.setCustName(inputUser.nextLine());

            System.out.println("masukan alamat : ");
            tamu.setCustAddres(inputUser.nextLine());

            System.out.println("masukan email:");
            tamu.setCustEmail(inputUser.nextLine());

            System.out.println("masukan no hp :");
            tamu.setCustPhone(inputUser.nextInt());

            System.out.println(tamu.getCustId());
            System.out.println(tamu.getCustName());
            System.out.println(tamu.getCustAddres());
            System.out.println(tamu.getCustEmail());
            System.out.println(tamu.getCustPhone());
        }

    }
}
