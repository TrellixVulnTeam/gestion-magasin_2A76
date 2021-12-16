package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Fournisseur;
@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
