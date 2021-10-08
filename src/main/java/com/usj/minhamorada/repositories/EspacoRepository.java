package com.usj.minhamorada.repositories;

import com.usj.minhamorada.models.Espaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacoRepository extends JpaRepository <Espaco, Long> {


}
