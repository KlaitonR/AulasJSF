package com.example.AppJSF.validators;

import com.example.AppJSF.bean.login.LoginBean;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@RequestScoped
public class Validators implements Serializable {

    private List<String> emailsDB = Arrays.asList("klaitonricken@hotmail.com", "kleitonricken@hotmai.com");

    @Inject
    private LoginBean loginBean;

    public void validateDuplicationEmail(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        System.out.println(loginBean.getLanguege());
        String email = (String) o;
        if(emailsDB.contains(email)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Esse email já existe", "");
            throw new ValidatorException(message);
        }
    }

    public void validateFile(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        Part file = (Part) o;
        try{
            validateFileNameLength(file);
            validateContentType(file);
            validateFileSize(file);

        }catch (RuntimeException e){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "");
            throw new ValidatorException(message);
        }
    }

    private void validateFileNameLength(Part file){
        if(file.getSubmittedFileName().length() > 10)
            throw new RuntimeException("O nome + extensão não pode ser maior que 10 car");
    }

    private void validateContentType(Part file){
        String contentType = file.getContentType();
        if(file.getSubmittedFileName().equals("image/png") && !contentType.equals("image/jpge"))
            throw new RuntimeException("Apenas imagens PNG e JPGE são permitidas");
    }

    private void validateFileSize(Part file){
        if(file.getSize() > 1048576*100)
            throw new RuntimeException("O arquivo não pode exeder 100Mb");
    }

}
