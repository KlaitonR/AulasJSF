package com.example.AppJSF.model;

import com.example.AppJSF.model.enums.Turno;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Estudante implements Serializable {

    private Integer id;
    private String nome = "Klaiton";
    private String sobrenome = "Ricken";
    private Double nota1 = 9.0;
    private Double nota2 = 7.5;
    private Double nota3 = 10.0;
    private Turno turno = Turno.MATUTINO;
    private String email;
    private transient boolean editing;

    public Estudante(){

    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

    public Estudante(String nome, String sobrenome, Double nota1) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
    }

    public Estudante(String nome, String sobrenome, Double nota1, Integer id) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
        this.id = id;
    }

    public static List<Estudante> estudanteList(){
        return new ArrayList<>(Arrays.asList(new Estudante("Luffy", "D", 10.0, 1),
                new Estudante("Ace", "D", 10.0, 2),
                new Estudante("Sabo", "D", 10.0, 3)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(id, estudante.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", turno=" + turno +
                ", email='" + email + '\'' +
                '}';
    }
}
