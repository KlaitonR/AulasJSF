package com.example.AppJSF.bean.comunicacao;

import com.example.AppJSF.model.Estudante;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {

    private String buttonName = "Nome do botão do bean";
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public void execute(ActionEvent event){
       String nome = (String)event.getComponent().getAttributes().get("nome");
       String adjetivo = (String)event.getComponent().getAttributes().get("adjetivo");
       Estudante estudante = (Estudante) event.getComponent().getAttributes().get("estudante");

        System.out.println(nome);
        System.out.println(adjetivo);
        System.out.println(estudante.getNome());

    }

}
