package com.moujib.backend.repository.product;

import com.moujib.backend.model.product.Equipment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {

    @Query("SELECT e FROM Equipment e")
    List<Equipment> getAllEquipments();

    @Query("SELECT e FROM Equipment e WHERE e.id = :id")
    Equipment getEquipmentById(int id);

    @Query("SELECT e FROM Equipment e WHERE e.equipmentType = :equipmentType")
    List<Equipment>getEquipmentsByType(String equipmentType);

}
