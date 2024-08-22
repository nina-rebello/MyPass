package br.com.fiap.myPass.password;

import br.com.fiap.myPass.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pass")
public class PasswordController {

    @Autowired
    PasswordService service;

    @GetMapping
    public List<Password> findAll(){
        return service.findAll();
    }

}
