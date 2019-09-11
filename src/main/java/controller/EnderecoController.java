package controller;

import dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EnderecoService;
import utils.Path;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public void principal(){
        System.out.println("TESTE");
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = Path.ENDPOINT_CEP)
    public ResponseEntity<EnderecoDTO> buscaEndereco(@PathVariable("cep") String cep){
        System.out.println(cep);
        EnderecoDTO enderecoDTO = enderecoService.getAddress(cep);
        System.out.println(enderecoDTO.toString());
        return ResponseEntity.ok(enderecoDTO);
    }

}
