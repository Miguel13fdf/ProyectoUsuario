package com.example.ExamenWeb_AlejandroHaro.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamenWeb_AlejandroHaro.Model.Usuario;
import com.example.ExamenWeb_AlejandroHaro.Service.IUsuarioService;






//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping ("/prueba")
public class UsuarioRestController {
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping ("/usuarios")
	public List<Usuario> index() {
		return usuarioService.ListAll();
	}
	
	@GetMapping ("/usuarios/{id}")
	public Usuario findUserById(@PathVariable("id") Long id_usu) {
		return usuarioService.findUsuarioById(id_usu);
	}
	 @PostMapping("/usuarios")
	    public Usuario saveUser(@RequestBody Usuario usuario) {
	        return usuarioService.saveUsuario(usuario);
	    }

	    @PutMapping("/usuarios/{id}")
	    public Usuario updateUser(@PathVariable("id") Long id_usu, @RequestBody Usuario usuario) {
	        return usuarioService.updateUsuario(id_usu, usuario);
	    }

	    @DeleteMapping("/usuarios/{id}")
	    public void deleteUser(@PathVariable("id") Long id_usu) {
	        usuarioService.deleteUsuario(id_usu);
	    }

}
