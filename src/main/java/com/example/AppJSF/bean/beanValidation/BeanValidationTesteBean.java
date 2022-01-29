package com.example.AppJSF.bean.beanValidation;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.*;
import java.io.Serializable;

@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable {

    @Size(min = 3, max = 10, message = "O nome precisa ter entre 3 e 10 caracteres")
    @NotNull(message = "Nome obrigatório")
    private String nome;
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})+$   ", message = "Email inválido")
    private String email;
    @DecimalMax(value = "30.00", message = "O valor não pode ser maior que 30")
    @DecimalMin(value = "5.00", message = "O valor não pode ser menor que 5")
    private double decimal;
    @Digits(integer = 3, fraction = 2, message = "O valor não pode ser maior que 999, e casa decimal maior que dois digitos")
    private double numero;

    public void salvar(){
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
}
