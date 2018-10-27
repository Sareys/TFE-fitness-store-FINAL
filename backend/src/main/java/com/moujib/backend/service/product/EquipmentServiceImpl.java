package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Equipment;
import com.moujib.backend.repository.product.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    private EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentServiceImpl (EquipmentRepository equipmentRepository){
        this.equipmentRepository = equipmentRepository;
    }


    @Override
    public List<Equipment> getAllEquipments() {
        return equipmentRepository.getAllEquipments();
    }

    @Override
    public List<Equipment> getEquipmentByType(String equipmentType) {
        return equipmentRepository.getEquipmentsByType(equipmentType);
    }

    @Override
    public void createNewEquipment(Equipment equipment) {
        equipmentRepository.save(equipment);
    }

    @Override
    public void updateEquipment(Equipment equipment){
        equipmentRepository.save(equipment);
    }

    @Override
    public void deleteEquipment(Equipment equipment) {
        equipmentRepository.delete(equipment);
    }

    @Override
    public Equipment getEquipmentById(int id) {
        return equipmentRepository.getEquipmentById(id);
    }
}
