package com.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;
import org.yaml.snakeyaml.events.Event.ID;
import com.springboot.demo.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer>{    //Integer is a primary key

	@Query("SELECT n FROM Card n WHERE n.name=:name")
	public List<Card> findByName(@RequestParam("name") String name);     //@RequestParam is fetch the details


	
	  // seaching by first letter of the word
	  
	  @Query("SELECT n FROM Card n where n.name like ?1%")
	  public List<Card>findByLetter(@RequestParam("name") String name);
	 

	
	/*
	 * // seaching by last letter of the word
	 * 
	 * @Query("SELECT n FROM Card n where n.name like %?1") public
	 * List<Card>findByLetter(@RequestParam("name") String name);
	 * 
	 */
	
	/*
	 * //seaching by the perticular(s) letter only
	 * 
	 * @Query("SELECT n FROM Card n where n.name like 's%'") public
	 * List<Card>findByLetter(@RequestParam("name") String name);
	 * 
	 */ 

}
