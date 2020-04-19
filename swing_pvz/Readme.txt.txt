Tubes OOP Milestone 2
Plants vs Zombies swing
kelompok 12

- Pertama, compile terlebih dahulu semua file .java dalam folder agar mendapat .class.
- Method main(string args[]) ada pada file bernama Pusat.java, jadi, lakukan perintah java Pusat di cmd.
- Ada pula method main yang berada di Main.java. Itu hanyalah tambahan jika ingin menjalankan program lewat cmd. Jika ingin menjalankan program dengan swing, harap jalankan Pusat.java
- Akan muncul frame yang menunjukkan taman berukuran 5x12 lahan dan 3 buah button. 2 untuk memilih plant dan 1 untuk memulai pergerakan.
- Zombie sudah siap di ujung kanan taman dan akan bergerak jika tombol 'start' diklik.
- Untuk menanam tanaman, klik salah 1 button plant. Akan muncul frame baru untuk menentukan posisi tempat plant ingin ditanam.
- Jumlah sunflower akan berkurang sesuai harga plant yang berhasil tertanam.
- Klik tombol start untuk memulai pergerakan zombie dan tanaman.
- Sambil kodenya berjalan, pemain dapat menanam tanaman.
- Sunflower akan bertambah tiap waktu setelah tombol start ditekan.
- Zombie baru akan muncul dari ujung kanan taman seiring program berjalan.
- Permainan berakhir jika salah satu zombie sudah mencapai ujung kiri taman atau plant membunuh semua zombie.

HAL YANG PERLU DIPERHATIKAN:
- Pada Kondisi.java, terdapat atribut string yang merepresentasikan lokasi gambar disimpan
//gambar
    String cardpea = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\peashootercard.jpg";
    String cardrep = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\repeatercard.jpg";
    String gbrpeashooter = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\peashooter.jpg"; 
    String gbrrepeater = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\repeater.jpg";
    String gbrzombie = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\zombie.jpg";
    String gbrghoul = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\ghoul.jpg";
    String gbrpea = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\pea.jpg";
    String gbrlawn = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\lawn.jpg";

- Kode ini akan digunakan untuk mengeset gambar petak pada kode seperti ini:
	label.setIcon(new javax.swing.ImageIcon(gbrpeashooter));

- Variabel memuat lokasi gambar yang akan digunakan. Semua gambar yang digunakan diletakkan pada satu folder bernama 'gambar'

- Karena kode ini mengambil lokasi gambar di file directory komputer, variabel string tersebut harus diubah sesuai lokasi folder gambar disimpan

- Contoh: jika gambar peashooter disimpan di folder document, variabel gambar harus diubah menjadi:
String gbrpeashooter = "C:\\Users\\seana\\OneDrive\\Documents\\gambar\\peashooter.jpg";
-ini berlaku untuk semua gambar. 