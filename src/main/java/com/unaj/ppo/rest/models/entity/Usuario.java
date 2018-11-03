package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", length=45, nullable=false)
    private String nombre;

    @Column(name = "apellido", length=45, nullable=false)
    private String apellido;

    @Column(name = "email", length=200, nullable=false,unique = true)
    private String email;

    @Column(name = "direccion", length=200, nullable=false)
    private String direccion;

    @Column(name = "telefono", length=45)
    private String telefono;

    @Column(name = "usuario", length=45, nullable=false,unique = true)
    private String usuario;

    @Column(name = "contraseña", length=45)
    private String contraseña;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipousuario", nullable=false)
    private TipoUsuario tipoUsuario;

    @Column(name = "social", length=200)
    private String social;

    public Usuario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public enum TipoUsuario {
        Estudiante,
        Profesor
    }
}