package com.moujib.backend.controller.product;

import com.moujib.backend.model.product.Equipment;
import com.moujib.backend.service.product.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EquipmentController {

    private EquipmentService equipmentService;

    @Autowired
    public EquipmentController (EquipmentService equipmentService){
        this.equipmentService = equipmentService;
    }


    @GetMapping(value = "/allEquipments")
    public List<Equipment> getAllEquipment(){
        return equipmentService.getAllEquipments();
    }

    @GetMapping(value = "/equipmentByType")
    public List<Equipment> getEquipmentsByType(@RequestParam String equipmentType){
        return equipmentService.getEquipmentByType(equipmentType);
    }

    @PostMapping(value = "/createEquipment")
    public void createNewEquipment(@RequestBody Equipment equipment){
        equipmentService.createNewEquipment(equipment);
    }

    @PutMapping(value = "/updateEquipment")
    public void updateEquipment(@RequestBody Equipment equipment){
        equipmentService.updateEquipment(equipment);
    }

    @DeleteMapping(value = "/deleteEquipment")
    public void deleteEquipment(@RequestBody Equipment equipment){
        equipmentService.deleteEquipment(equipment);
    }

}
