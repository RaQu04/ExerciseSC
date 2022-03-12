package com.example.ExeSuncode.value;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ValueController {

    private final ValueServices valueServices;

    public ValueController(ValueServices valueServices) {
        this.valueServices = valueServices;
    }


    @GetMapping("/values")
    public List<ValueEntity> getValue(){
        return valueServices.findAll();
    }

    @GetMapping("/values/{id}")
    public Optional<ValueEntity> getValueById(@PathVariable Long id){
        return valueServices.getValueById(id);
    }

    @GetMapping("/column1")
    public List<ValueEntity> getDuplicateFromColumn1(){
        return valueServices.getDuplicateColumn1();
    }
    @GetMapping("/column2")
    public List<ValueEntity> getDuplicateFromColumn2(){
        return valueServices.getDuplicateColumn2();
    }
    @GetMapping("/column3")
    public List<ValueEntity> getDuplicateFromColumn3(){
        return valueServices.getDuplicateColumn3();
    }
    @GetMapping("/column4")
    public List<ValueEntity> getDuplicateFromColumn4(){
        return valueServices.getDuplicateColumn4();
    }
}
