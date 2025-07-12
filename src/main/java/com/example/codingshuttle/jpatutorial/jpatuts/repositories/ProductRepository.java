package com.example.codingshuttle.jpatutorial.jpatuts.repositories;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByTitle(String title);

    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    List<ProductEntity> findByQuantityAndPrice(int quantity, BigDecimal price);

    List<ProductEntity> findByQuantityGreaterThanAndPriceLessThan(int quantity, BigDecimal price);

    List<ProductEntity> findByQuantityGreaterThanOrPriceLessThan(int quantity, BigDecimal price);

    List<ProductEntity> findByTitleLike(String title);

    List<ProductEntity> findByTitleContaining(String title);

    List<ProductEntity> findByTitleContainingIgnoreCase (String title);


    // ProductEntity findByTitleAndPrice(String title, BigDecimal price);  //we can use Optional<ProductEntity>
//    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);


    @Query("SELECT p from ProductEntity p WHERE p.title=?1 and p.price=?2")      // This is the JPQL
    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);

    @Query("SELECT p from ProductEntity p WHERE p.title=:title and p.price=:price")
    Optional<ProductEntity> findByTitleAndPriceNamedParams(String title, BigDecimal price);

    @Query(value="SELECT * from product_table WHERE title_x=:title and price=:price", nativeQuery = true)    // this is the SQL
    Optional<ProductEntity> findByTitleAndPriceNative(String title, BigDecimal price);
}
