package com.springboot.demo.service;

import java.util.List;


import com.springboot.demo.entity.Card;

public interface CardService {

	public List<Card> getCards();

	Card saveCard(Card card);

	Card getById(int id);

	Card saveUpdated(Card card);

	void deleteById(Integer id);

	List<Card> findByName(String name);

	List<Card> findByLetter(String name);

}
