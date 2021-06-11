package br.com.wmomodas.wmomodas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("teste","Sua Marca, seu estilo - Nossos Serviços");

        List<String> servicos = new ArrayList<>();
        servicos.add("Consertos");
        servicos.add("Reformas");
        servicos.add("Fabricação Própria");


        model.addAttribute("serverTime", new Date().toString())  ;
        model.addAttribute("servicos", servicos);

        return "home";
    }
}
