package com.donali.tarealabo2.controller;

import com.donali.tarealabo2.domain.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    //User dona, pass 1234
    
    @GetMapping("/login")
    public String returnLoginForm(Usuario usuario){
        return "Login";
    }

    @PostMapping("/validacion")
    public String returnResponse(Usuario usuario){
        if(usuario.getUser().equals("dona") && usuario.getPassword().equals("1234"))
            return "MostrarMensajeV";
        else return "MostrarMensajeF";
    }

}