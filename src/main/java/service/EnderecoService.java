package service;

import dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import utils.Path;

@Service
@FeignClient(value = Path.URL_VIACEP, name = "viacep")
public interface EnderecoService {

    @GetMapping(value = Path.CEP_JSON)
    public EnderecoDTO getAddress(@PathVariable("cep") String cep);

}
