package com.example.AppJSF.bean.application;

import com.example.AppJSF.bean.dependent.TesteDependentBean;
import com.example.AppJSF.bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

    private List<String> categoriaList;

    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteApplicationBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init(){
        categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror");
    }

    public void mudarLista(){
        categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror", "Ação");
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
