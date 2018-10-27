package com.moujib.backend.controller.product;

import com.moujib.backend.model.product.Clothe;
import com.moujib.backend.service.product.ClotheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClotheController {

    private ClotheService clotheService;

    @Autowired
    public ClotheController(ClotheService clotheService) {
        this.clotheService = clotheService;
    }

    @GetMapping(value = "/allClothes")
    public List<Clothe> getAllClothes() {
        List<Clothe> clothes = clotheService.getAllClothes();
        return clothes;
    }

    @GetMapping(value = "/menClothes")
    public List<Clothe> getMenClothes() {
        List<Clothe> menClothes = clotheService.getMenClothes();
        return menClothes;
    }

    @GetMapping(value = "/womenClothes")
    public List<Clothe> getWomenClothes() {
        List<Clothe> womenClothes = clotheService.getWomenClothes();
        return womenClothes;
    }

    @GetMapping(value = "/getClothesByType")
    public List<Clothe> getClotheByType() {
        List<Clothe> clothesByType = clotheService.getClotheByType();
        return clothesByType;
    }

    @PostMapping(value = "/createNewClothe")
    public void createClothe(@RequestBody Clothe clothe) {
        Clothe newClothe = clothe;
        clotheService.createNewClothe(clothe);
    }

    @PutMapping(value = "/updateClothe")
    public void updateClothe(@RequestBody Clothe clothe) {
        clotheService.updateClothe(clothe);
    }

    @DeleteMapping(value = "/deleteClothe")
    public void deleteClothe(@RequestBody Clothe clothe) {
        clotheService.deleteClothe(clothe);
    }


}