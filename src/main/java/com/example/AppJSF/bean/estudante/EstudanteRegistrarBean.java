package com.example.AppJSF.bean.estudante;

//import javax.faces.bean.ManagedBean;
import com.example.AppJSF.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

@Named("estudanteRegistrarWebBean")
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private List<String> nomes = Arrays.asList("Klaiton", "Kleiton", "AAAAA");
    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Klaiton", "Kleiton", "AAAAA"));
    private Map<String,String> nomesMap = new HashMap<>();
    private Boolean mostrarNotas = Boolean.FALSE;

    {
        nomesMap.put("Klaiton", "Ricken");
        nomesMap.put("kleiton", "Ricken");
        nomesMap.put("AAAA", "BBBB");
    }

    public void executar(){
        System.out.println("Buscando...");
        System.out.println("Processando...");
        System.out.println("Exibindo");
    }

    public void executar(String param){
        System.out.println("Buscando...");
        System.out.println("Processando...");
        System.out.println("Exibindo");
        System.out.println(param);
    }

    public String executarRetorno(String param){
        System.out.println("Buscando...");
        System.out.println("Processando...");
        System.out.println("Exibindo");
        System.out.println(param);
        return param;
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }

    public void exibirNotas() {
        if (mostrarNotas)
            this.mostrarNotas = Boolean.FALSE;
        else
            this.mostrarNotas = Boolean.TRUE;
    }

    public void calcularCubo(LambdaExpression le, Long value){
        Long result = (Long)le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }



    public Boolean getMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(Boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }
}
