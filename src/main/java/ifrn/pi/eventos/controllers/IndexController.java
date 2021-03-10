package ifrn.pi.eventos.controllers;
//tudo que for colocado aqui aparece no console!
//tudo que for colocado na html aparece no navegado!

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller para devolver ao usuário a pagina home
@Controller
public class IndexController {
	//método que retorna a página para o spring sempre que o usuário digitar a url
	@RequestMapping("/")
	public String Index() {
		//sempre que o método for chamado no navegador, a mensagem abaixo é impressa no console
		System.out.println("Chamou o método!");
		//retorna o nome da página que deverá ser mostrada para o usuário (no caso a Index)
		return("Index");
	}

}
