package com.senai.login.Controller;

import com.senai.login.Dtos.LoginDto;
import com.senai.login.Dtos.MensagemDto;
import com.senai.login.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Conta")
public class LoginController {

    @Autowired
    LoginService loginservico;

@PostMapping("/Login")
    public ResponseEntity<MensagemDto> logar (@RequestBody LoginDto requisicao){


    MensagemDto resposta = new MensagemDto();
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(resposta);
}
@PostMapping("/Registro")
    public ResponseEntity<MensagemDto> resgistrar (@RequestBody LoginDto requisicao){

    loginservico.cadastrarConta(requisicao);
    MensagemDto resposta = new MensagemDto();
    resposta.setMensagem("Deuboa");
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(resposta);
}
@PostMapping("/esqueciminhasenha")
    public ResponseEntity<MensagemDto> recuperar (@RequestBody LoginDto requisicao){
    MensagemDto resposta = new MensagemDto();
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(resposta);
}

}
