# Java ile Geliştirilmiş Sezar Şifreleme Aracı

Bu proje, temel kriptografi prensiplerini anlamak amacıyla Java dilinde geliştirilmiş bir komut satırı uygulamasıdır. Kullanıcıdan alınan bir metni ve bir anahtar sayısını kullanarak metni Sezar şifreleme tekniği ile şifreler ve şifrelenmiş metni tekrar orijinal haline çözer.

Bu proje, Gazi Üniversitesi'ndeki siber güvenlik eğitimim sırasında Java becerilerimi geliştirmek için oluşturduğum ilk projelerden biridir.

<img width="373" height="87" alt="image" src="https://github.com/user-attachments/assets/7e2efeb6-95d5-4ddc-8c6d-6d25026fe4f1" />


## 🚀 Özellikler

- **Şifreleme:** Girilen metni, belirtilen anahtar kadar alfabede ileri kaydırarak şifreler.
- **Şifre Çözme:** Şifrelenmiş bir metni, anahtar yardımıyla orijinal haline geri getirir.
- **Karakter Koruması:** Sadece harfleri (`a-z`, `A-Z`) şifreler. Rakamları, boşlukları ve özel karakterleri değiştirmez.
- **Büyük/Küçük Harf Duyarlılığı:** Metindeki büyük ve küçük harfleri koruyarak şifreleme yapar (Örn: 'A' şifrelenince 'D' olur, 'a' ise 'd' olur).

---

## 🛠️ Kullanılan Teknolojiler

- **Dil:** Java
- **Geliştirme Ortamı:** Herhangi bir metin editörü (VS Code, IntelliJ IDEA, Eclipse vb.) ve JDK (Java Development Kit).

---

## ⚙️ Nasıl Çalıştırılır?

Bu projeyi kendi bilgisayarınızda çalıştırmak için aşağıdaki adımları izleyebilirsiniz.

1.  **Depoyu Klonlayın:**
    ```bash
    git clone [https://github.com/Mirac-BRG/Java-Sezar-Sifreleme.git](https://github.com/Mirac-BRG/Java-Sezar-Sifreleme.git)
    ```

2.  **Klasöre Gidin:**
    ```bash
    cd Java-Sezar-Sifreleme
    ```

3.  **Java Dosyasını Derleyin:**
    ```bash
    javac SifrelemeAraci.java
    ```

4.  **Programı Çalıştırın:**
    ```bash
    java SifrelemeAraci
    ```
    Program çalıştıktan sonra sizden şifrelenecek metni ve anahtarı girmenizi isteyecektir.

---
