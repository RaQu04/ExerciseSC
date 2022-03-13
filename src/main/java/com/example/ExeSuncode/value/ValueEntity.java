package com.example.ExeSuncode.value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "tabela_testowa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ValueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String kolumna1;
    String kolumna2;
    String kolumna3;
    String kolumna4;

    public ValueEntity(String kolumna1, String kolumna2, String kolumna3, String kolumna4) {
        this.kolumna1 = kolumna1;
        this.kolumna2 = kolumna2;
        this.kolumna3 = kolumna3;
        this.kolumna4 = kolumna4;
    }

    @Override
    public String toString() {
        return "ValueEntity{" +
                "id=" + id +
                ", kolumna1='" + kolumna1 + '\'' +
                ", kolumna2='" + kolumna2 + '\'' +
                ", kolumna3='" + kolumna3 + '\'' +
                ", kolumna4='" + kolumna4 + '\'' +
                '}';
    }
}
