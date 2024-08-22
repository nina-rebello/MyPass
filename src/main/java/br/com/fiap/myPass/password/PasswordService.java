package br.com.fiap.myPass.password;

import br.com.fiap.myPass.user.User;
import br.com.fiap.myPass.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordService {
    @Autowired
    PasswordRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Password> findAll(){
        return repository.findAll();
    }


}

