package com.moujib.backend.controller.product;

import com.moujib.backend.model.product.Food;
import com.moujib.backend.service.product.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FoodController {

    private FoodService foodService;

    @Autowired
    public FoodController (FoodService foodService){
        this.foodService = foodService;
    }

    @GetMapping(value="/allFood")
    public List<Food> getAllFoods(){
        return foodService.getAllFood();
    }

    @GetMapping(value="/foodByType")
    public List<Food> getFoodByType(String foodType){
        return foodService.getFoodByType(foodType);
    }

    @PostMapping(value = "/createFood")
    public void createNewFood(@RequestBody Food food){
        foodService.createNewFood(food);
    }

    @PutMapping(value = "/updateFood")
    public void updateFood(@RequestBody Food food){
        foodService.updateFood(food);
    }

    @DeleteMapping(value = "/deleteFood")
    public void deleteFood(@RequestBody Food food){
        foodService.deleteFood(food);
    }

}
