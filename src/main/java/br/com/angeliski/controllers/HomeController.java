package br.com.angeliski.controllers;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.angeliski.entidades.Livro;

@Controller
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, value = "getBook")
	public @ResponseBody Livro getBook(
			@RequestParam(value = "name", required = false, defaultValue = "Harry Potter") String name) {

		Livro livro = new Livro();
		livro.setNome(name);
		return livro;
	}

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "Hello Roger");
		return "welcome";
	}

}
