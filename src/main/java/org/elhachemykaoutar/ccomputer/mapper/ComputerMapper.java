package org.elhachemykaoutar.ccomputer.mapper;

import org.elhachemykaoutar.ccomputer.dao.entities.Computer;
import org.elhachemykaoutar.ccomputer.dto.Computerdto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
        private final ModelMapper mapper = new ModelMapper();
        public Computer fromComputerDtoToComputer(Computerdto computerDto) {
            return mapper.map(computerDto,Computer.class);
        }

        public Computerdto fromComputerToComputerDto(Computer computer) {
            return mapper.map(computer,Computerdto.class);
        }


}
