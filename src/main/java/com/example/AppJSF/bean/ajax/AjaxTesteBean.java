package com.example.AppJSF.bean.ajax;

import javax.faces.component.behavior.AjaxBehavior;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Named
@ViewScoped
public class AjaxTesteBean implements Serializable {

    private String nome;
    private String sobrenome;
    private String email;
    private Map<String, List<String>> alfabeto;
    private List<String> letras;
    private String letraSelecionada;
    private String letraDaChave;

    public void init(){
        System.out.println("entrou");
        alfabeto = new TreeMap<>();
        alfabeto.put("A", Arrays.asList("B", "c", "D"));
        alfabeto.put("E", Arrays.asList("F", "G", "H"));
        alfabeto.put("I", Arrays.asList("J", "K", "L"));
    }

    public void onSelectLetra(){

        if(letraSelecionada == null){
            letras = null;
            return;
        }

        letras = alfabeto.get(letraSelecionada);
    }

    public void toUpperCase(AjaxBehavior event){
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
    }

    public void toUpperCase2(){
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
    }

    public void toUpperCaseNome(){
        this.nome = this.nome.toUpperCase();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, List<String>> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(Map<String, List<String>> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
    }

    public String getLetraSelecionada() {
        return letraSelecionada;
    }

    public void setLetraSelecionada(String letraSelecionada) {
        this.letraSelecionada = letraSelecionada;
    }

    public String getLetraDaChave() {
        return letraDaChave;
    }

    public void setLetraDaChave(String letraDaChave) {
        this.letraDaChave = letraDaChave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
