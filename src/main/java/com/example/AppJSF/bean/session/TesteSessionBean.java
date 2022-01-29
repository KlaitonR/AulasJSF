package com.example.AppJSF.bean.session;

import com.example.AppJSF.model.Estudante;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable {

    private List<String> personagens;
    private List<String> personagensSelecionado = new ArrayList<>();

    private Estudante estudante;

    @PostConstruct
    public void init(){
        personagens = Arrays.asList("a", "b", "c");
        logar();
    }

    public void logar(){
        estudante = new Estudante();
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagensSelecionado.add(personagem);
    }

    public List<String> getPersonagensSelecionado() {
        return personagensSelecionado;
    }

    public void setPersonagensSelecionado(List<String> personagensSelecionado) {
        this.personagensSelecionado = personagensSelecionado;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
