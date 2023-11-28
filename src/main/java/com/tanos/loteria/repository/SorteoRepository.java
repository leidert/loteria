package com.tanos.loteria.repository;

import com.tanos.loteria.model.Sorteo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository("repository")
public interface SorteoRepository extends MongoRepository<Sorteo,String> {
}
