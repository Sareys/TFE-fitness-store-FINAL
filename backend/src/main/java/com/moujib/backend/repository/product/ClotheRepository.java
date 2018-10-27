package com.moujib.backend.repository.product;

import com.moujib.backend.model.product.Clothe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClotheRepository extends CrudRepository<Clothe, Integer>{

    @Query("SELECT c FROM Clothe c")
    List<Clothe> getAllClothes();

    @Query("SELECT c FROM Clothe c WHERE c.sex = 'male'")
    List<Clothe> getMenClothes();

    @Query("SELECT c FROM Clothe c WHERE c.sex = 'female'")
    List<Clothe> getWomenClothes();

    @Query("SELECT c FROM Clothe c WHERE c.clotheType = :clotheType")
    List<Clothe> getClotheByType();

}
