package org.elhachemykaoutar.ccomputer.service;

import org.elhachemykaoutar.ccomputer.dto.Computerdto;

import java.util.List;

public interface ComputerService {
    public Computerdto saveComputer(Computerdto computerdto);
    public List<Computerdto> getComputerByProce(String proce);
    public List<Computerdto> saveComputers(List<Computerdto> computerdtos);
}
