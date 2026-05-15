package vallegrande.edu.pe.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "enrollments")

public class Enrollment {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String curso;

    private String fecha;

    public Enrollment() {
    }

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getCurso() {

        return curso;

    }

    public void setCurso(String curso) {

        this.curso = curso;

    }

    public String getFecha() {

        return fecha;

    }

    public void setFecha(String fecha) {

        this.fecha = fecha;

    }

}