package br.com.wmomodas.persistence;

import br.com.wmomodas.model.Cliente;
import br.com.wmomodas.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}


