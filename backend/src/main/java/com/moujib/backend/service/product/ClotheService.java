package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Clothe;

import java.util.List;

public interface ClotheService {

    List<Clothe> getAllClothes();

    List<Clothe> getMenClothes();

    List<Clothe> getWomenClothes();

    List<Clothe> getClotheByType();

    void createNewClothe(Clothe clothe);

    void updateClothe(Clothe clothe);

    void deleteClothe(Clothe clothe);

}