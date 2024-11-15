package dio.padroes_projeto.filtros;

import dio.padroes_projeto.Post;

public abstract class Filtro {
    public Filtro proximoFiltro;

    public Filtro(Filtro proximoFiltro){
        this.proximoFiltro = proximoFiltro;
    }

    public void filtrar(Post post){
        if (proximoFiltro == null) {
            System.out.println("Postagem pode ser feita!\n"+post);
            System.out.println(post);
            return;
        }
        
        proximoFiltro.filtrar(post);
    }

    public static Filtro criarFiltroPadrao(){
        Filtro filtro = new FiltroUsuarioVerificado(null);
        filtro = new FiltroConteudoOfensivo(filtro);
        filtro = new FiltroSpam(filtro);
        filtro = new FiltroFormatoMensagem(filtro);
        
        return filtro;
    }

}
