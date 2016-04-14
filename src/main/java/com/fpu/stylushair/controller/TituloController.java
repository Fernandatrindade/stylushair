package com.fpu.stylushair.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.fpu.stylushair.model.Usuario;

@Controller
@RequestMapping("/titulos")
public class TituloController {

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Usuario usuario){
	//TODo: Salvar no banco de dados
		 
		 System.out.println(">>>>" +usuario.getNome());
		 return "CadastroTitulo";
}
}
