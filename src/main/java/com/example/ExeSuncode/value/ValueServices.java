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

    public List<ValueEntity> getDuplicateColumn1() {
       return valueRepo.duplikatKolumna1();
    }

    public List<ValueEntity> getDuplicateColumn2() {
        return valueRepo.duplikatKolumna2();
    }

    public List<ValueEntity> getDuplicateColumn3() {
        return valueRepo.duplikatKolumna3();
    }

    public List<ValueEntity> getDuplicateColumn4() {
        return valueRepo.duplikatKolumna4();
    }


    public List<ValueEntity> getUniqueColumn1() {
        return valueRepo.unikalnaKolumna1();
    }
    public List<ValueEntity> getUniqueColumn2() {
        return valueRepo.unikalnaKolumna2();
    }
    public List<ValueEntity> getUniqueColumn3() {
        return valueRepo.unikalnaKolumna3();
    }
    public List<ValueEntity> getUniqueColumn4() {
        return valueRepo.unikalnaKolumna4();
    }
}
