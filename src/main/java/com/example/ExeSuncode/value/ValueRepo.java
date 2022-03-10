package com.example.ExeSuncode.value;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepo extends CrudRepository<ValueEntity, Long> {

}
