package dio.padroes_projeto.filtros;

import java.util.Arrays;
import java.util.List;

import dio.padroes_projeto.Post;

class FiltroConteudoOfensivo extends Filtro {
    List<String> palavrasOfensivas;

    public FiltroConteudoOfensivo(Filtro proximoFiltro){
        super(proximoFiltro);

        palavrasOfensivas = Arrays.asList(
            "odiar", "preconceito", "intolerancia"
        );
    }

    @Override
    public void filtrar(Post post){
        for (String palavra : palavrasOfensivas) {
            if (post.getMensagem().contains(palavra.toLowerCase())){
                System.out.println("Mensagem contêm palavras ofensivas!");
                System.out.println(post);
                return;
            }
        }

        super.filtrar(post);
    }
}
