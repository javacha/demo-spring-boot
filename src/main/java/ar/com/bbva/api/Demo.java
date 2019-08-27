package ar.com.bbva.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class Demo {

    @Autowired
    private PersonaRepository personaRepository;

    @RequestMapping(value="/saludo/{nombre}", method = RequestMethod.GET)
    public Persona holaMundo(@PathVariable String nombre, @RequestParam String apellido){

        return new Persona(nombre, apellido);

    }


    @RequestMapping(value="/persona", method= RequestMethod.POST)
    public Persona persistirPersona(@RequestBody Persona persona){
        return personaRepository.save(persona);
    }

    @RequestMapping(value="/persona", method = RequestMethod.GET)
    public Iterable<Persona> buscarTodasLasPersonas(){
        return personaRepository.findAll();
    }

}
