REGISTER SCREEN

Bu program sadece hasta kayıt amaçlıdır.Girilen bilgiler terminal kısmında görülebilir.Örneği aşağıda verilmiştir.

![8](https://github.com/user-attachments/assets/bedd9f12-4ee5-40de-85f7-f55ce5f09fe9)

Password belirtilmesinin amacı tamamen bilgi alımını göstermek amaçlıdır.
Bilgiler girilirken kodda da belirtilen regexlerle bilgilerin hangi aralıklarda girilmesi gerektiği JOptionPane aracılığıyla uyarı mesajı gönderilir.

![1](https://github.com/user-attachments/assets/817580fd-fef6-4876-a907-8e475f762ee4)

Uyarı mesajları da toplu olarak çıkmaz. Özel olarak her TextField için spesifik olarak ayrı ayrı belirtilmiştir.Uyarı mesajlarından bazıları aşağıdaki gibidir.

![2](https://github.com/user-attachments/assets/5e2883ff-e569-4193-ad60-7bda345f53a0)
![3](https://github.com/user-attachments/assets/b9a97f0c-ee03-4dfc-8084-795436c50066)
![4](https://github.com/user-attachments/assets/9be146db-e695-4761-8c6b-5bbf4fbe65b9)

İlk frame yani kayıt ekranı tamamlandığında bilgiler terminalde yazdırılır ve ikinci frame olan şifre ve kullanıcı adı oluşturma ekranı gelir.

![5](https://github.com/user-attachments/assets/59e39710-2ced-4186-b325-429351ce7375)

Burda şifre içinde bir regex tanımlandığından örneğin 8 haneden az olduğunda kabul edilmez ve tekrar şifre girilmesi istenir.

![6](https://github.com/user-attachments/assets/3ba3ba02-ef92-4550-8b6e-06e8b9c4bab3)

Bu sayfa tamamlandıktan sonra yeni bir frame çıkar teşekkürler frame'i.Bu frame 2 saniye sonra uyku moduna geçer.Ve yazdığım bazı kod satırlarıyla programı kapatır.

![7](https://github.com/user-attachments/assets/b3cfa226-0536-4acb-bbc0-713b9ab7fef0)

