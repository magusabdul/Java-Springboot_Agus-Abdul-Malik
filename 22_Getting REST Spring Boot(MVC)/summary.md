# Getting REST Spring Boot(MVC)

## RESUME MATERI
1. SEJARAH SPRING BOOT
2. SPRING BOOT ARCHITECTURE
3. JPA dan HIBERNATE

### SEJARAH SPRING BOOT
FRAMEWORK JAVA
- PLAY FRAMEWORK(JAVA/SCALA)
- MICRONAUT
- SPRING MVC
- QUARKUS

SPRING dimulai tahun 2003 ketika banyak apklikasi yang berbasis enterprise (java EE)\
java Enterprise susah dan sering terjadi di java\
ada bebberapa project yang ingin membuat framework yang memudahkan dan tidak banyak konflik\
java spring boot dapat memudahkan dan meminimalkan konflik\
mvn clean instal untuk mengupdate 

2 tipe framework
1. Optionated -> lengkap(Web server, Controller, Data Acces)  contoh spring, 
2. Non optionated -> kumpulan library, modular(Web server)

Mengapa spring?
- auto config
- menggunakan annotation based
- embedded servelet container


### Spring Boot architecture
- Controller classes -> Presentation layer
- Service Classes -> Business Ligic Layer
- Repository Classes -> Data Access Layer

Spring application
```java
@SpringBootAplication
public class MyAplication {
    public static void main(String[] args){
        SpringAplication.run(MyAplication.class, args);
    }
}
```

Controller (Presentation layer)\
HTTP Request dan HTTP Response
```java
@RestController
@RequireMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/id")
    public BaseResponse<ProductOutput getProduct(@PathVariable final long id){
        return new BaseResponse<(productService.getProduct(id));
    }
}
```

Annotations
```java
@RestController for Controller class
@ResquestMapper for path naming
@GetMapping for GET method
@PostMapping for POST method
@PutMapping for PUT method
@DeleteMapping for DELETE method
```

Service / Business Logic layer
```java
@Service
@RequireArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProducRepository productRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public void setModelMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }
    @Override
    public ProductOutput getProduct(Long id){
        Optional<Product> product = productRepository.findById(id);
        return modelMapper.map(product, ProductOutput.class);
    }
}
```

Annotations
```java
@Service for Service class
@Autowired for enabling you to inject  the object dependency implicitly
```

Repository / Data layer\
digunakan untuk pengqueryan\
database access terjadi disini
```java
public interface ProductRepository extend CrudRepository<Product Long>{}
```

### JPA dan Hibernate
java persistance api bertugas mengqueri berjalan diatas hibernate

JPA Dependencies

Spring JPA dan Datasource Properties
```java
spring.datasource.url=jdbc:postgresql:://localhost:5432/demo
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Swagger -> /swagger-ui.html

Lombok

Useful Library

## Task
Objective\
Implement MVC structure in Springboot

### Problem 1 - H2 Database
Buatlah project Springboot dengan database H2 dan struktur MVC yang memiliki 3 endpoint berikut!
- GET /v1/posts\
Melihat seluruh data Post yang tersimpan dalam database.
- POST /v1/posts\
Menerima data Post dan menyimpannya dalam database.
- DELETE /v1/posts/{id}\
Menghapus data Post dari database.

### Problem 2 - Repository
Cobalah gunakan CrudRepository dan JPARepository dan jelaskan perbedaannya!
