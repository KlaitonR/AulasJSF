package com.example.AppJSF.bean.comunicacao;

import com.example.AppJSF.model.Estudante;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class ComunicacaoTeste5Bean implements Serializable {

    private String nome;
    private String sobrenome;
    private Estudante estudante = new Estudante();
    private Estudante estudante2;

    public void execute(){
        System.out.println("EXECUTE " + nome);
        System.out.println("EXECUTE " + sobrenome);
        System.out.println("EXECUTE " + estudante2.getNome());
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Estudante getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante estudante2) {
        this.estudante2 = estudante2;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        System.out.println("Property " + sobrenome);
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("Property " + nome);
        this.nome = nome;
    }
}
