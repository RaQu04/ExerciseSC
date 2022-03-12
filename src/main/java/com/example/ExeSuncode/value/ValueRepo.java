package com.example.ExeSuncode.value;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValueRepo extends CrudRepository<ValueEntity, Long> {

    @Query(value = "select * from tabela_testowa where kolumna1 in (SELECT kolumna1 FROM tabela_testowa GROUP BY  kolumna1 HAVING count(kolumna1) > 1)", nativeQuery = true)
   List<ValueEntity> duplikatKolumna1();

    @Query(value = "select * from tabela_testowa where kolumna2 in (SELECT kolumna2 FROM tabela_testowa GROUP BY  kolumna2 HAVING count(kolumna2) > 1)", nativeQuery = true)
    List<ValueEntity> duplikatKolumna2();

    @Query(value = "select * from tabela_testowa where kolumna3 in (SELECT kolumna3 FROM tabela_testowa GROUP BY  kolumna3 HAVING count(kolumna3) > 1)", nativeQuery = true)
    List<ValueEntity> duplikatKolumna3();

    @Query(value = "select * from tabela_testowa where kolumna4 in (SELECT kolumna4 FROM tabela_testowa GROUP BY  kolumna4 HAVING count(kolumna4) > 1)", nativeQuery = true)
    List<ValueEntity> duplikatKolumna4();
}
