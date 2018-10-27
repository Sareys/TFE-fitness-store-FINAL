package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Equipment;

import java.util.List;

public interface EquipmentService {

    Equipment getEquipmentById(int id);

    List<Equipment> getAllEquipments();

    List<Equipment> getEquipmentByType(String equipmentType);

    void createNewEquipment(Equipment equipment);

    void updateEquipment(Equipment equipment);

    void deleteEquipment(Equipment equipment);
}
