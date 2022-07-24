package br.com.desfio.dominio;

public abstract class Conteudo {
   //final declara uma constante
   //protected as classes filhas terão acesso
    protected double xP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcularxp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
