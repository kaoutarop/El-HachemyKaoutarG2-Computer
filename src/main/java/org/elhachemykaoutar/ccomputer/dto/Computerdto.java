package org.elhachemykaoutar.ccomputer.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Computerdto {
    private String proce;
    private int ram;
    private String hardDrive;
    private double price;
    private String macAddress;

}
