package dev.java10x.CadastroDeNinjas.ninjas.Repository;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
