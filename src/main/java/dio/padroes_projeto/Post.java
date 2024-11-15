package dio.padroes_projeto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Post {
    private Usuario usuario;
    private String mensagem;

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Usuario: ").append(usuario.getNome()).append("\n")
            .append("Post:\n")
            .append(mensagem).append("\n")
        .toString();
    }
}
