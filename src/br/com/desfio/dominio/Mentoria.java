package br.com.desfio.dominio;

import java.time.LocalDate;
//classe mentoria é filha da classe Conteudo
public class Mentoria extends Conteudo{
    private LocalDate data; //para trabalhar com datas

    public Mentoria() {
    }

    @Override
    public double calcularxp() {
        return xP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
