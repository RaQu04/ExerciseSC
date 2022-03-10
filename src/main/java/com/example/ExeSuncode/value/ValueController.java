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
}
