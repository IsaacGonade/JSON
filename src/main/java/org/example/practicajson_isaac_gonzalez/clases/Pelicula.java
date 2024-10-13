package org.example.practicajson_isaac_gonzalez.clases;

public class Pelicula {
    private int id;

    private String titulo;

    private String fecha;

    private String director;

    private String genero;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", director='" + director + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}