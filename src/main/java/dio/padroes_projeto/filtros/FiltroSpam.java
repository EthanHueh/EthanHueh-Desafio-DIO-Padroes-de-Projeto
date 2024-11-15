package dio.padroes_projeto.filtros;

import dio.padroes_projeto.Post;

class FiltroSpam extends Filtro {

    public FiltroSpam(Filtro proximoFiltro) {
        super(proximoFiltro);
    }

    @Override
    public void filtrar(Post post) {
        String msg = post.getMensagem();

        if (msg.contains("http")){
            System.out.println("Possível spam!");
            System.out.println(post);
            return;
        }

        super.filtrar(post);
    }

}
