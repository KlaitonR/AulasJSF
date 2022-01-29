package com.example.AppJSF.bean.comunicacao;

import com.example.AppJSF.model.Estudante;
import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ws.rs.core.Cookie;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;


@Named
@ViewScoped
public class ComunicacaoTeste8Bean implements Serializable {

    private String key;
    private String value;

    public void init(){
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        Cookie cookie = (Cookie) requestCookieMap.get("nome");
//        try {
//            String decode = URLDecoder.decode(cookie.getValue(), "UTF-8");
//            System.out.println(decode);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        System.out.println(requestCookieMap);
    }

    public String salvarCookie(){
        Faces.addResponseCookie(key,value,-1);
        return "comunicacao9?faces-redirect=true";
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
