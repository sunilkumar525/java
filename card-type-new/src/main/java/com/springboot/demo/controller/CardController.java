package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.demo.entity.Card;
import com.springboot.demo.service.CardService;

@Controller
public class CardController {

	//has a relation
	private CardService cardService;

	//constuctor injection
	public CardController(CardService cardService) {
		super();
		this.cardService = cardService;
	}	
	//to return the list of cards in html style
	
	@GetMapping("/cards")
	public String add(Model model) {

		model.addAttribute("cards",cardService.getCards());
		return "cards";
	}

	// to handle(hold) a single card object(redirects to form i.e add page)
	@GetMapping("/cards/new")
	public String button(Model model) {
		Card card=new Card();
		model.addAttribute("card", card);
		return "create_card";
	}
	//saving the added details
	@PostMapping("/cards")
	public String saveCard(@ModelAttribute("card") Card card) {
		cardService.saveCard(card);
		return "redirect:/cards";
	}
	// edit button-> getting cards details for editing
	@GetMapping("/cards/edit/{id}")
	public String updateButton(@PathVariable int id,Model model) {
		model.addAttribute("card",cardService.getById(id));
		return "edit";

	}

	// used to save the updated
	@PostMapping("/cards/{id}")
	public String saveUpdated(@PathVariable int id,@ModelAttribute("card") Card card) {

		// get cards by Id from database
		Card existingCard=cardService.getById(id);
		existingCard.setName(card.getName());
		existingCard.setDate(card.getDate());
		existingCard.setCardno(card.getCardno());
		existingCard.setCardtype(card.getCardtype());
		existingCard.setId(id);

		cardService.saveCard(existingCard);
		return "redirect:/cards";
	}
	// get student by Id for deleting
	@GetMapping("cards/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		cardService.deleteById(id);
		return "redirect:/cards";
	}
	
	@GetMapping("/cards/details")
    public String search(@RequestParam String name,Model model) {
        model.addAttribute("name",cardService.findByName(name));
        return "custom_query";
    }
	
	
	  @GetMapping("/cards/details/letter") public String searchByLetter
	  (@RequestParam String name,Model model) {
	  model.addAttribute("name",cardService.findByLetter(name));
	  return "custom_query";
	  
	  }
	 
	 








} 

