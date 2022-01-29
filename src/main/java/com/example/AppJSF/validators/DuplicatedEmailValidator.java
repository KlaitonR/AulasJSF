package com.example.AppJSF.validators;

import com.example.AppJSF.bean.login.LoginBean;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@FacesValidator
public class DuplicatedEmailValidator implements Validator {

    private List<String> emailsDB = Arrays.asList("klaitonricken@hotmail.com", "kleitonricken@hotmai.com");

    @Inject
    private LoginBean loginBean;

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        System.out.println(loginBean.getLanguege());
        String email = (String) o;
        if(emailsDB.contains(email)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Esse email já existe", "");
            throw new ValidatorException(message);
        }
    }

    public List<String> getEmailssDB() {
        return emailsDB;
    }

    public void setEmailssDB(List<String> emailssDB) {
        this.emailsDB = emailssDB;
    }
}
