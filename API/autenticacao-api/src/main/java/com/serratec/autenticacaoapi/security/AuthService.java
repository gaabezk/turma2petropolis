package com.serratec.autenticacaoapi.security;

import com.serratec.autenticacaoapi.models.Autor;
import com.serratec.autenticacaoapi.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    AutorService service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Autor autor = service.getAutor(username);
        return new UserSS(autor.getId(), autor.getEmail(),autor.getSenha());
    }


}
