package com.example.lector_rss.Adpter;

public class Noticia {
    private int id;
    private String nombreNoticia;
    private String fechaNoticia;
    private String autorNoticia;
    private int foto;

    public Noticia(int id, String nombreNoticia, String fechaNoticia, String autorNoticia, int foto) {
        this.id = id;
        this.nombreNoticia = nombreNoticia;
        this.fechaNoticia = fechaNoticia;
        this.autorNoticia = autorNoticia;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreNoticia() {
        return nombreNoticia;
    }

    public void setNombreNoticia(String nombreNoticia) {
        this.nombreNoticia = nombreNoticia;
    }

    public String getFechaNoticia() {
        return fechaNoticia;
    }

    public void setFechaNoticia(String fechaNoticia) {
        this.fechaNoticia = fechaNoticia;
    }

    public String getAutorNoticia() {
        return autorNoticia;
    }

    public void setAutorNoticia(String autorNoticia) {
        this.autorNoticia = autorNoticia;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "id=" + id +
                ", nombreNoticia='" + nombreNoticia + '\'' +
                ", fechaNoticia='" + fechaNoticia + '\'' +
                ", autorNoticia='" + autorNoticia + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
