package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Food;
import com.moujib.backend.repository.product.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    @Override
    public List<Food> getAllFood() {
        return foodRepository.getAllFoods();
    }

    @Override
    public List<Food> getFoodByType(String foodType) {
        return foodRepository.getFoodByType(foodType);
    }

    @Override
    public void createNewFood(Food food) {
        foodRepository.save(food);
    }

    @Override
    public void updateFood(Food food) {
        foodRepository.save(food);
    }

    @Override
    public void deleteFood(Food food) {
        foodRepository.delete(food);
    }
}
