
package sifrelemearaci;


import java.util.Scanner;

public class SifrelemeAraci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Basit Sezar Şifresi Aracı ---");
        System.out.print("Lütfen şifrelenecek metni girin: ");
        String orijinalMetin = scanner.nextLine();
        System.out.print("Lütfen bir anahtar girin (1-25 arası bir sayı): ");
        int anahtar = scanner.nextInt();

        String sifreliMetin = sifrele(orijinalMetin, anahtar);
        System.out.println("Şifrelenmiş Metin: " + sifreliMetin);

        String cozulenMetin = sifreCoz(sifreliMetin, anahtar);
        System.out.println("Çözülmüş Metin: " + cozulenMetin);

        scanner.close();
    }

    public static String sifrele(String metin, int anahtar) {
        StringBuilder sifreliMetin = new StringBuilder();
        for (char karakter : metin.toCharArray()) {
            if (Character.isLetter(karakter)) {
                char baz = Character.isUpperCase(karakter) ? 'A' : 'a';
                int orijinalSira = karakter - baz;
                int yeniSira = (orijinalSira + anahtar) % 26;
                char sifreliKarakter = (char) (baz + yeniSira);
                sifreliMetin.append(sifreliKarakter);
            } else {
                sifreliMetin.append(karakter);
            }
        }
        return sifreliMetin.toString();
    }

    public static String sifreCoz(String sifreliMetin, int anahtar) {
        return sifrele(sifreliMetin, 26 - anahtar);
    }
}