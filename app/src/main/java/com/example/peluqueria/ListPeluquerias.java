package com.example.peluqueria;

import android.view.WindowInsets;

public class ListPeluquerias {
    public String foto;
    public String nombre;
    public String horario;
    public String servicio;
    public String calle;
    public String telefono;
    public String email;
    public ListPeluquerias(String foto, String nombre, String horario, String servicio, String calle, String telefono, String email) {
        this.foto = foto;
        this.nombre = nombre;
        this.horario = horario;
        this.servicio = servicio;
        this.calle = calle;
        this.telefono = telefono;
        this.email = email;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getServicio() { return servicio; }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getCalle() { return calle; }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }
}
