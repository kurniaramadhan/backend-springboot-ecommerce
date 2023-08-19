# Backend - Spring Boot - Ecommerce
[![Project Version][version-image]][version-url]
[![Database][Database-image]][Database-url]
[![Language][Language-image]][Language-url]
[![Framework][Framework-image]][Framework-url]

> Backend aplikasi ini dikembangkan menggunakan bahasa pemrograman Java dan framework Spring Boot dalam menangani data pada e-commerce.

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/github_username/repo_name">
    <img src="download.png" alt="Logo">
  </a>
</div>

## Teknologi

* [![Mysql][Mysql.com]][Mysql-url]
* [![Java][Java.com]][Java-url]
* [![Spring][Spring.io]][Spring-url]
* [![Postman][Postman.com]][Postman-url]


<!-- GETTING STARTED -->
## Memulai aplikasi

1. Clone project
2. Buat akun database dengan username: ecommerceapp dan password: ecommerceapp
3. Login pada database dengan akun yang telah dibuat tersebut, buat database dengan nama: full-stack-ecommerce
4. Konfigurasi database pada file: application.properties yang berada pada folder project \src\main\resources
   ```sh
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/full-stack-ecommerce?useSSL=false&useUnicode=yes&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&serverTimezone=UTC
    spring.datasource.username=ecommerceapp
    spring.datasource.password=ecommerceapp

    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

    spring.data.rest.base-path=/api

   ```
5. Masuk ke direktori project spring-boot-ecommerce dan jalankan perintah:
   ```sh
   mvn spring-boot: run
   ```

<!-- CONTRIBUTING -->
## Kontribusi

Kontrobusi terhadap komunitas open source menjadi salah satu cara belajar yang luar biasa dan inspiratif. Apapun bentuk kontribusi yang Anda buat dalam project ini **sangat diapresiasi**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Jangan lupa memberi project ini bintang! Terima kasih sekali lagi!

1. Fork project nya
2. Buat branch fitur Anda sendiri (contoh: `git checkout -b feature/AmazingFeature`)
3. Commit perubahan yang Anda lakukan (`git commit -m 'Add some AmazingFeature'`)
4. Push ke branch (`git push origin feature/AmazingFeature`)
5. Lakukan permintaan Pull Request



<!-- LICENSE -->
## License

Distributed under the Apache 2.0 License.


<!-- CONTACT -->
## Contact

Linkedin - https://www.linkedin.com/in/kurniaramadhanputra/

Github: https://github.com/kurniaramadhan


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[product-screenshot]: images/screenshot.png
[Mysql.com]: https://img.shields.io/badge/Mysql-4A4A55?style=for-the-badge&logo=mysql&logoColor=FF3E00
[Mysql-url]: https://www.mysql.com/
[Java.com]: https://img.shields.io/badge/java-35495E?style=for-the-badge&logo=java&logoColor=4FC08D
[Java-url]: https://www.java.com/
[Spring.io]: https://img.shields.io/badge/Spring-29ab6c?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/
[Postman.com]: https://img.shields.io/badge/postman-000000?style=for-the-badge&logo=postman&logoColor=white
[Postman-url]: https://www.postman.com/

[version-image]: https://img.shields.io/badge/Version-1.0.0-brightgreen?style=for-the-badge&logo=appveyor
[version-url]: https://img.shields.io/badge/version-1.0.0-green
[Database-image]: https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge
[Database-url]: https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge
[Language-image]: https://img.shields.io/badge/Language-Java%2017-important?style=for-the-badge
[Language-url]: https://img.shields.io/badge/Language-Java%2017-important?style=for-the-badge
[Framework-image]: https://img.shields.io/badge/Framework-SpringBoot-important?style=for-the-badge
[Framework-url]: https://img.shields.io/badge/Framework-SpringBoot-important?style=for-the-badge
