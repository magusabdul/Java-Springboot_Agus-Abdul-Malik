# 25 Implementation Relational(1o1 - 1oMany - ManyoMany)

## RESUME MATERI
1. SQL Advance
2. Database Cardinality
3. JPA Queries Advance and JPA Entity Relationship

### SQL Advance
SQL query mempunyai fungsi spesifik\
SQL Advance meiliki beberpa fungsi seperti:
- LIKE
- LIMIT
- OFFSET
- SUM
- AVG
- MAX
- COUNT
- GROUP BY
- ORDER BY
- JOINS


LIKE\
untuk mencari string yang sama, fungsi ini mendukung opsi % dan _\
contoh: 
```sql
SELECT * FROM Product WHERE Package LIKE '%jars%';
```

LIMIT dan OFFSET\
untuk membatasi nomer baris menggunakan LIMIT dan OFFSET\
contoh: 
```sql
SELECT
employee_id,
first_name,
last_name,
salary
FROM
employees
ORDER BY
salary DESC
LIMIT 1 OFFSET 1;
```

### Database Cardinality

Cardinality Database\
teori kaya mengaitkan dua entity berbeda

ONE TO ONE RELATIONSHIP\
satu entity hanya memiliki relasi ke satu enitity lain

ONE TO MANY RELATIONSHIP\
satu entity yang memiliki relasi ke banyak enitity lain

MANY TI MANY RELATIONSHIP\
satu entity yang memiliki banyak relasi ke enitity lain

### JPA Queries Advance and JPA Entity Relationship
JPA Like
```java
@Repository
public interface CategoryRepository extends JpaRepsitory<Category, Long> {
    Category findByNameContains(String name);
}
```

JPA Count
```java
@Repository
public interface CategoryRepository extends JpaRepsitory<Category, Long> {
    @Query("select count(*) from category")
    Integer countCategories();
}
```

JPA Max and Min

JPA Avg

JPA Sum

JPA Pagination
```java
@Repository
public interface CategoryRepository extends JpaRepsitory<Category, Long> {
    Page<Cateogry> findAllPaginatedCategories(Pageable pageable);
}
```

JPA Group by

JPA Order by

## TASK
### CHALLENGE 1
Ada sebuah desain database table disamping
dari skema database tersebut, konversikan ke dalama JPA Relationship
![database]()

### CHALLENGE 2
Berdasarkan dari relationship diatas buatlah beberapa query dengan JPA seperti berikut:
1. Get all product with category
2. Paginate products using pageable
3. Sort product by category
4. Search product by name
