package com.example.AppJSF.bean.conversation;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ConversationScoped
public class TesteConversationBean implements Serializable {

    private List<String> personagens;
    private List<String> personagensSelecionado = new ArrayList<>();

    @Inject
    private Conversation conversation;

    public void init(){
        personagens = Arrays.asList("a", "b", "c");
        if(conversation.isTransient()){
            conversation.begin();
        }
    }

    public String endConversation(){
        if(!conversation.isTransient()){
            conversation.end();
        }

        return "conversation?faces-redirect=true";
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

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
