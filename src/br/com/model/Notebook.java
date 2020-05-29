package br.com.model;

public class Notebook {

    private int id;
    private String modelo;
    private String marca;
    private String serie;
    private String tipo;

    public Notebook() {
    }

    public Notebook(int id, String modelo, String marca, String serie, String tipo) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
