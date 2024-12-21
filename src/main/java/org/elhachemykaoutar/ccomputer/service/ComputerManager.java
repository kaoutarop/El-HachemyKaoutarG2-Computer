package org.elhachemykaoutar.ccomputer.service;

import lombok.AllArgsConstructor;
import org.elhachemykaoutar.ccomputer.dao.entities.Computer;
import org.elhachemykaoutar.ccomputer.dao.repository.ComputerRepository;
import org.elhachemykaoutar.ccomputer.dto.Computerdto;
import org.elhachemykaoutar.ccomputer.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{
    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;
    @Override
    public Computerdto saveComputer(Computerdto computerdto) {
        Computer computer=computerMapper.fromComputerDtoToComputer(computerdto);
        computer=computerRepository.save(computer);
        computerdto=computerMapper.fromComputerToComputerDto(computer);
        return computerdto;
    }

    @Override
    public List<Computerdto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<Computerdto> computerdtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerdtos.add(computerMapper.fromComputerToComputerDto(computer));
        }

        return computerdtos;
    }

    @Override
    public List<Computerdto> saveComputers(List<Computerdto> computerdtos) {
        List<Computer> computers = new ArrayList<>();
        for (Computerdto computerdto : computerdtos) {
            computers.add(computerMapper.fromComputerDtoToComputer(computerdto));
        }
        computerRepository.saveAll(computers);
        computerdtos=new ArrayList<>();
        for (Computer computer : computers) {
            computerdtos.add(computerMapper.fromComputerToComputerDto(computer));
        }

        return computerdtos ;
    }
}
