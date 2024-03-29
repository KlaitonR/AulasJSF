package com.example.AppJSF.bean.converter;

import com.example.AppJSF.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
public class ConverterTesteBean implements Serializable {

    private List<Estudante> estudanteList = Estudante.estudanteList();
    private Estudante estudante;

    public void save(){
        System.out.println("SALVANDO");
        System.out.println(estudante);
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
