package com.example.demo.models;

public class Queen {
    private String id;
    public String nombre;
    public String apellido;
    public String category;

    public Queen(String id, String nombre, String apellido, String category){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.category = category;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
