package com.generation.bsms.collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/")

public class BsmsController {
	
	@GetMapping ("/mensagen")
	public String Bsms () {
		return 
				""
				+ "<ul>\n"
				+ "<h2>Mentalidades</h2>"
				+ "<li>Orientacao</li>\n"
				+ "<li>Responsabilidade Pessoal</li>\n"
				+ "<li>Mentalidade de Crescimento</li>\n"
				+ "<li>Persistencia</li>\n"
				+ "<h2>Habilidades</h2\n>"
				+ "<li>Trabalho em Equipe</li>\n"
				+ "<li>Proatividade</li>\n"
				+ "<li>Comunicação</li>\n"
				+ "<li>Atenção aos detalhes </li>\n"
				+ "</ul>n";
		
	}


@ GetMapping ( "/objetivo" )
public  String  objetivo () {
	
	return  
			""
			+ "<ol>\n"
			+ "<h2>Objetivos de aprendizagem desta semana.</h2>"
			+ "<li>Estrutura de primavera</li>\n"
			+ "<li>Atenção aos Detalhes</li>\n"
			+ "<li>Comunicação</li>\n"
			+ "</ol>";
	
	
}

}
