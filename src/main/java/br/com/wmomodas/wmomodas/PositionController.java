package br.com.wmomodas.wmomodas;

import br.com.wmomodas.model.Position;
import br.com.wmomodas.persistence.PositionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/position"})
public class PositionController {

    private PositionRepository repository;

    PositionController(PositionRepository positionRepository){
        this.repository = positionRepository;
    }

    @PutMapping(value="/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
                                 @RequestBody Position position) {
        return repository.findById(id)
                .map(record -> {
                    record.setLatitude(position.getLatitude());
                    record.setLongitude(position.getLongitude());

                    Position updated  = repository.save(record);

                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
