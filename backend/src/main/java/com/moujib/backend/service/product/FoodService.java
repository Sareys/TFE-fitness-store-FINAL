package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodService {
    List<Food> getAllFood();

    List<Food> getFoodByType(String foodType);

    void createNewFood(Food food);

    void updateFood(Food food);

    void deleteFood(Food food);

}
