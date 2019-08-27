package ar.com.bbva.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class Demo {

    @RequestMapping(value="/saludo/{nombre}", method = RequestMethod.GET)
    public Persona holaMundo(@PathVariable String nombre, @RequestParam String apellido){

        return new Persona(nombre, apellido);

    }

}
