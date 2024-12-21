package org.elhachemykaoutar.ccomputer.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pc;
    private String proce;
    private int ram;
    private String hardDrive;
    private double price;
    private String macAddress;
}
