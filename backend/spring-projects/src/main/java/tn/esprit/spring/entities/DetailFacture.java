package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name="DetailFacture")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DetailFacture implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDetailFacture")
	private Long idDetailFacture;
	private Integer qte;
	private float prixTotal;
	private Integer pourcentageRemise; 
	private Integer montantRemise;
	
	@ManyToOne
	private Produit produit ; 
	@ManyToOne
	private Facture facture ;

	
	
	
}
