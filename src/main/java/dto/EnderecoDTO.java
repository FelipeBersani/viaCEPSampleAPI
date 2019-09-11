package dto;

import lombok.*;
import model.Endereco;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EnderecoDTO {

    private Endereco endereco;

}
