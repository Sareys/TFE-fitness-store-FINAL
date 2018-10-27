package com.moujib.backend.repository.product;

import com.moujib.backend.model.product.Food;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<Food, Integer>{

    @Query("SELECT f FROM Food f")
    List<Food> getAllFoods();

    @Query("SELECT f FROM Food f WHERE f.foodType = :foodType")
    List<Food> getFoodByType(@Param("foodType") String foodType);

}