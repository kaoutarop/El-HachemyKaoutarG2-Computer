package org.elhachemykaoutar.ccomputer.web;

import lombok.AllArgsConstructor;
import org.elhachemykaoutar.ccomputer.dto.Computerdto;
import org.elhachemykaoutar.ccomputer.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public Computerdto saveComputer(@Argument Computerdto computer){

        return computerService.saveComputer(computer);
    }

    @QueryMapping
    public List<Computerdto> getComputerByProce(@Argument String proce){

        return computerService.getComputerByProce(proce);
    }

}
