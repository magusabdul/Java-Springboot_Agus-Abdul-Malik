# 26 JPA (Spring Database No SQL)

## RESUME MATERI
1. SPRING BOOT MONGODB
2. Configuration Datasource
3. Koding java

### SPRING BOOT MONGODB
Required Dependencies
- Spring Web
- Spring Data MongoDB
- Lombok

Structure Folder MVC:
- Controller
sebagai kumpulan routing Rest Api atau disebut endpoint\
kode kode untuk menerima requst dari user dan mengirimkan response
- Model 
Sebagai bentuk dasar dari bussines model, POJO(plain old java object)\
menjadi struktur data yang akan di kirim kan atau diterima
- Repository
sebagai interface yang berhubungan langsung dengan database
- Service
kumpulan interface digunakan untuk bussines/rules/logic


### Configuration Datasource
tambahkana atribut di application.properties disesuaikan dengan mongodb yang digunakan
```java
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=alterra_dev
```

### Koding java
Create model Product
```java
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data \\ anotasi lombok untuk menggantikan getter dan setter
@Document("product") \\ anotasi mongodb untuk mengubah nama collections, secara default nama collection akan disamakan dengan nama_class
public class Product {
    @Id  \\ anotasi spring data untuk menandakan sebagai identify document(unique id) dan sebagai syarat membuat document harus memiliki id

    public String id;
    public String name;
    public Integer qty;
    public float price;
    public List<String> tags;
}
```

Create repository\
repositoru menggunakan interdace adalah bagian dari Domain-Driver Design. Sebuah mekanisme pembungkusan untuk mengakses database. Proses CRUD basi sudah ditangani, tanpa kita perlu tau detail prosesnya
```java
import com.magusabdul.springmongo.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{   
}
```

Create Product Service\
interface service digunakan sebagai blueprint proses bisnis
```java
import java.util.List;

import com.magusabdul.springmongo.model.Product;

public interface ProductService {
    Product create(Product product);
    List<Product> findAll();
    Product findById(String  id);
    Product update(String id, Product product);
    void delete(String id);
}
```

Create Product Service implement\
class service digunakan untuk melakukan proses bisnis
```java
import java.util.List;

import com.magusabdul.springmongo.model.Product;
import com.magusabdul.springmongo.repository.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        // TODO Auto-generated method stub
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        // TODO Auto-generated method stub
        return productRepository.findById(id).orElseThrow(()->{
            throw new RuntimeException("Not Found");
        });
    }

    @Override
    public Product update(String id, Product product) {
        // TODO Auto-generated method stub
        Product productById = this.findById(id);
        productById.setName(product.getName());
        productById.setPrice(product.getPrice());
        productById.setQty(product.getQty());
        return productRepository.save(productById);
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        Product product = this.findById(id);
        productRepository.delete(product);
    }
}
```

Create ProductController\
class controller digunakan untuk routing url
```java
import java.util.List;

import com.magusabdul.springmongo.model.Product;
import com.magusabdul.springmongo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    
    @Autowired
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product){
        Product productCreated = productService.create(product);
        return ResponseEntity.ok(productCreated);
    }

    @GetMapping
    public ResponseEntity<?> listProduct(){
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> product(@PathVariable("id") String id) {
        try {
            Product product = productService.findById(id);
            return ResponseEntity.ok(product);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Product product) {
        try {
            Product productUpdated = productService.update(id, product);
            return ResponseEntity.ok(productUpdated);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        try {
            productService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
```

## TASK
Objective
- Implement NoSQL database in Springboot

### Problem - NoSQL Implementation
Buatlah project Springboot dengan database MongoDB dan struktur MVC yang dapat melakukan CRUD data berikut!

Product
- id
- name
- price

Transaction
- id
- customer_name
- transaction_details
- is_paid
- created_at

TransactionDetail
- id
- transaction_id
- product_id
- quantity
