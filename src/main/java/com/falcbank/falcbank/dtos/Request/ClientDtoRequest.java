package com.falcbank.falcbank.dtos.Request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClientDtoRequest {
    @NotBlank(message = "O campo não pode ser vazio ou nulo")
    private String name;
    @NotBlank(message = "O campo não pode ser vazio ou nulo")
    @Size(max = 11)
    private String cpfCnpj;

    @NotBlank(message = "O campo não pode ser vazio ou nulo")
    private String email;
    @NotBlank(message = "O campo não pode ser vazio ou nulo")
    private String password;

    @NotBlank(message = "O campo não pode ser vazio ou nulo")
    private String typeUser;


    public ClientDtoRequest(String name, String cpfCnpj, String email, String password, String typeUser) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.password = password;
        this.typeUser = typeUser;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }
}
