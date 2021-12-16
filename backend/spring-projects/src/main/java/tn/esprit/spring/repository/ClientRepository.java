package tn.esprit.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    Optional<Client> findByEmail(String Email);

}