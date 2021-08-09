package com.generation.blogPessoal.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.blogPessoal.Repository.UsuarioRepository;
import com.generation.blogPessoal.model.Usuario;
import com.generation.blogPessoal.model.UsuarioLogin;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	public Optional <Usuario>cadastrarUsuario(Usuario usuario){
		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "o usuario já existe", null);
		int idade= Period.between(usuario.getDataNascimento(), LocalDate.now()).getYears();
		if(idade<18)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "o usuario é menor de idade", null);

		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder ();
		String senhaEncoder= encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return Optional.of(usuarioRepository.save(usuario));
	}

	public Optional <Usuario>atualizarUsuario(Usuario usuario){
		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) {
			int idade= Period.between(usuario.getDataNascimento(), LocalDate.now()).getYears();
			if(idade<18)
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "o usuario é menor de idade", null);
			
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder ();
		String senhaEncoder= encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return Optional.of(usuarioRepository.save(usuario));
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "usuario não encontrado", null);
			
		}
	}
	 //metodo para comparar uma senha criptografada com uma que nao está
	//esse get no meio é que usuariologin é uma classe e usuario é outra.
	private Optional <UsuarioLogin> loginUsuario(Optional<UsuarioLogin> usuarioLogin){
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder ();
		Optional <Usuario> usuario= usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());
		if (usuario.isPresent()) {
			if(encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {
				
			}
		}
		
	}
	
}
