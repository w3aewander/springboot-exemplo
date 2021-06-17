package br.com.wmomodas.wmomodas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapaController {

    @RequestMapping("/mapa")
    public String mapa(Model model){

        return "home/mapa";
    }
}
