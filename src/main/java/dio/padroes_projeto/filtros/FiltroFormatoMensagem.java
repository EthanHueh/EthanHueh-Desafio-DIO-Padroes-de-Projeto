package dio.padroes_projeto.filtros;

import dio.padroes_projeto.Post;

class FiltroFormatoMensagem extends Filtro {
    public FiltroFormatoMensagem(Filtro proximoFiltro){
        super(proximoFiltro);
    }

    @Override
    public void filtrar(Post post) {

        String msg = post.getMensagem();

        if (msg.length() < 10 || msg.length() > 200){
            System.out.println("Mensagem deve ter entre 10 a 300 caracteres!");
            System.out.println(post);
            return;
        }

        super.filtrar(post);
    }
}
