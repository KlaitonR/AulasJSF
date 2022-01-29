package com.example.AppJSF.bean.view;

import com.example.AppJSF.bean.dependent.TesteDependentBean;
import com.example.AppJSF.bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {

    private List<String> personagens;
    private List<String> personagensSelecionado = new ArrayList<>();
    private TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteViewBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean){
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init(){
        personagens = Arrays.asList("a", "b", "c");
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

    public void setDependentBean(TesteDependentBean dependentBean) {
        this.dependentBean = dependentBean;
    }

    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagensSelecionado.add(personagem);
        dependentBean.getPersonagensSelecionado().add(personagem);
    }

    public List<String> getPersonagensSelecionado() {
        return personagensSelecionado;
    }

    public void setPersonagensSelecionado(List<String> personagensSelecionado) {
        this.personagensSelecionado = personagensSelecionado;
    }

}
