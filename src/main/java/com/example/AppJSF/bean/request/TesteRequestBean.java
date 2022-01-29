package com.example.AppJSF.bean.request;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {

    private List<String> personagens;
    private List<String> personagensSelecionado = new ArrayList<>();

    @PostConstruct
    public void init(){
        personagens = Arrays.asList("a", "b", "c");
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
}
