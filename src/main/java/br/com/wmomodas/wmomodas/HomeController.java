package br.com.wmomodas.wmomodas;

import br.com.wmomodas.model.Cliente;
import br.com.wmomodas.persistence.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    ClienteRepository clienteRepository;

    @RequestMapping("/")
    public String home(Model model){

        model.addAttribute("slogan","Nossa Marca, seu estilo - Nossos Serviços");

        List<String> servicos = new ArrayList<>();
        servicos.add("Consertos");
        servicos.add("Reformas");
        servicos.add("Fabricação Própria");


        model.addAttribute("serverTime", new Date().toString())  ;
        model.addAttribute("servicos", servicos);


//        var cliente = new Cliente();
//        cliente.setNome("Wanderlei Silva");
//        cliente.setEmail("wander.silva@gmail.com");
//        cliente.setCelular("27999979169");
//
//        clienteRepository.save(cliente);

        return "home/home";
    }

    @RequestMapping("/erro")
    public String html404(Model model) {

        model.addAttribute("mensagem", "Ops... foi mal, algo deu errado!");
        return "erro";
    }

    @RequestMapping("/consertos")
    public String servicos(Model model){

        return "home/consertos";
    }

    @RequestMapping("/reformas")
    public String reformas(Model model){

        return "home/reformas";
    }

    @RequestMapping("/fabrica")
    public String fabrica(Model model){

        return "home/fabrica";
    }

    @RequestMapping("/contato")
    public String contato(Model model){
        return "home/contato";
    }
}
