package com.example.AppJSF.bean.login;

import com.example.AppJSF.model.Estudante;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Named
@SessionScoped
public class LoginBean implements Serializable {

    private String nome;
    private String senha;
    private Estudante estudante;
    private List<Locale> localeList = Arrays.asList(new Locale("en"), new Locale("pt"));
    private String languege;
    private int qtMessages;

    public String logar(){
        if(nome.equals("k") && senha.equals("1")){
            estudante = new Estudante();
            qtMessages++;
            return "/restricted/iniciosistema.xhtml?faces-redirect=true";
        }

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário e/ou senha invalido(s)", ""));
        return null;
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        estudante = null;
        return "/login?faces-redirect=true";
    }

    public List<Locale> getLocaleList() {
        return localeList;
    }

    public void setLocaleList(List<Locale> localeList) {
        this.localeList = localeList;
    }

    public Integer getQtMessages() {
        return qtMessages;
    }

    public void setQtMessages(Integer qtMessages) {
        this.qtMessages = qtMessages;
    }

    public String getLanguege() {
        return languege;
    }

    public void setLanguege(String languege) {
        this.languege = languege;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
