package com.example.ExeSuncode.value;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ValueServices {

    private final ValueRepo valueRepo;

    public ValueServices(ValueRepo valueRepo) {
        this.valueRepo = valueRepo;
    }

    public List<ValueEntity> findAll(){
        return (List<ValueEntity>) valueRepo.findAll();
    }

    public Optional<ValueEntity> getValueById(Long id) {
        return valueRepo.findById(id);
    }
}
