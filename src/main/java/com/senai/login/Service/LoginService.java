package com.senai.login.Service;

import com.senai.login.Dtos.LoginDto;
import com.senai.login.Model.LoginModel;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class LoginService {

private LoginModel conta = new LoginModel();

public List<LoginDto> listaContas = new ArrayList();

public void cadastrarConta(LoginDto conta){

    
    listaContas.add(conta);

}
 public boolean validarNome(LoginDto nome){

    if(nome.getNome().equals("")){
        return false;
    }
    return true;
 }

 public boolean validarSenha(LoginDto senha){
    if(senha.getSenha().length() <= 5){

        return false;

    }
    return true;
 }

}
