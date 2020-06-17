package br.com.model;

public class NotebookReport {
    private int id;
    private String modelo;
    private String descricao;
    private String serie;
    private String tipo;

    public NotebookReport() {
    }

    public NotebookReport(int id, String modelo, String descricao, String serie, String tipo) {
        this.id = id;
        this.modelo = modelo;
        this.descricao = descricao;
        this.serie = serie;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
