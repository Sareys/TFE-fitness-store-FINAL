package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Clothe;
import com.moujib.backend.repository.product.ClotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClotheServiceImpl implements ClotheService {

    private ClotheRepository clotheRepository;

    @Autowired
    public ClotheServiceImpl(ClotheRepository clotheRepository){
        this.clotheRepository = clotheRepository;
    }

    @Override
    public List<Clothe> getAllClothes() {
        return clotheRepository.getAllClothes();
    }

    @Override
    public List<Clothe> getMenClothes() {
        return clotheRepository.getMenClothes();
    }

    @Override
    public List<Clothe> getWomenClothes() {
        return clotheRepository.getWomenClothes();
    }

    @Override
    public List<Clothe> getClotheByType() {
        return clotheRepository.getClotheByType();
    }

    @Override
    public void createNewClothe(Clothe clothe) {
        clotheRepository.save(clothe);
    }

    @Override
    public void updateClothe(Clothe clothe) {
        clotheRepository.save(clothe);
    }

    @Override
    public void deleteClothe(Clothe clothe) {
        clotheRepository.delete(clothe);
    }
}