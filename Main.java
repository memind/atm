import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3, balance = 0, caseDurumu, yatirma, cekme;
        
        while (right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123") ){
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                System.out.println("Mevcut Bakiyeniz: "+balance);
                
                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yapma");
                caseDurumu = input.nextInt();

                switch (caseDurumu){
                    case 1:
                    System.out.print("Yatırılacak Tutarı Giriniz: ");
                    yatirma = input.nextInt();
                    balance += yatirma;
                    System.out.println("Para Yatırma İşleminiz Gerçekleştirilmiştir. Güncel Bakiyeniz: "+balance);
                    break;

                    case 2:
                    System.out.print("Çekmek İstediğiniz Miktarı Giriniz: ");
                    cekme = input.nextInt();
                    if (cekme > balance){System.out.println("Hesabınızda Yeterli Bakiye Bulunmamaktadır\nMevcut bakiyeniz: "+balance);} else {balance -= cekme; System.out.println("Kalan Bakiyeniz: "+balance);}
                    break;

                    case 3:
                    System.out.println("Hesabınızda "+balance+" TL Bulunmaktadır");
                    break;

                    case 4:
                    System.out.println("Sistemden Başarıyla Çıkış Yaptınız, Tekrar Görüşmek Üzere");
                    break;

                    default:
                    System.out.println("Lütfen Geçerli Bir İşlem Giriniz!");
                                    }
                  } while(caseDurumu != 4);
                break;
            }
            else{
                right--;
                System.out.println("Hatalı Giriş. Tekrar Deneyiniz."); 
                if (right == 0){System.out.println("\n\nTEBRİKLER, HESABINIZ BLOKE OLMUŞTUR\n\n");}
                else{System.out.println("Kalan Hakkınız: "+ right);}
            }
        }
    }
}