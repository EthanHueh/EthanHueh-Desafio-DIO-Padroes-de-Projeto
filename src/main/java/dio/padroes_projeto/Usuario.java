package dio.padroes_projeto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    private String nome;
    private boolean isVerificado;

    public Post criarPost(String msg){
        return new Post(this, msg);
    }
}
