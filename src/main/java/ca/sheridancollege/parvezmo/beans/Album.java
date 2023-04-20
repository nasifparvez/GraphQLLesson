package ca.sheridancollege.parvezmo.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "albums")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Album {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String title;
	 private String artist;
	 private String genre;
	 private double price;
}
