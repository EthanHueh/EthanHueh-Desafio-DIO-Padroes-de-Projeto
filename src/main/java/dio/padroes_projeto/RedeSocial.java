package dio.padroes_projeto;

import java.util.Arrays;
import java.util.List;

import dio.padroes_projeto.filtros.Filtro;

public class RedeSocial {
    public static void main(String[] args) {

        Usuario usu1 = new Usuario("Pedro", true);
        Usuario usu2 = new Usuario("Vigarista", false);

        List<Post> postagem = Arrays.asList(
            usu1.criarPost("o ceu e tao azul e lindo!"),
            usu2.criarPost("devemos odiar pessoas azuis"),
            usu1.criarPost("oi"),
            usu2.criarPost(criarMensagemLonga()),
            usu2.criarPost(
                "R$ 999.999.999,99 foram inseridos na sua conta, acesse\n"+
                "https..sitesincrivelmentesuspeito.com/ para receber!"
            )
        );

        Filtro filtro = Filtro.criarFiltroPadrao();
        for (Post post : postagem) {
            filtro.filtrar(post);
        }
        
    }

    private static String criarMensagemLonga() {
        StringBuilder msgLonga = new StringBuilder();
        for (int i = 0; i < 300; i++){
            msgLonga.append(i);
        }
        return msgLonga.toString();
    }
}
