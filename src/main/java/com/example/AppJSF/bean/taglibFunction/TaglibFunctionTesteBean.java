package com.example.AppJSF.bean.taglibFunction;

import org.apache.commons.lang3.text.WordUtils;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ViewScoped
public class TaglibFunctionTesteBean implements Serializable {

    private List<String> names = Arrays.asList("klaiton", "kleiton", "kkkkkkkkk");

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
