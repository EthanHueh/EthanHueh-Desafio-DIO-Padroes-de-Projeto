package dio.padroes_projeto.filtros;

import dio.padroes_projeto.Post;

class FiltroUsuarioVerificado extends Filtro {
    public FiltroUsuarioVerificado(Filtro proximoFiltro){
        super(proximoFiltro);
    }

    @Override
    public void filtrar(Post post) {
        if (!post.getUsuario().isVerificado()){
            System.out.println("Post de usuário não verificado!");
            System.out.println(post);
            return;
        }
        super.filtrar(post);
    }
}
