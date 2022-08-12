package com.springboot.demo.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.springboot.demo.entity.Card;
import com.springboot.demo.repository.CardRepository;
import com.springboot.demo.service.CardService;


@Service
public class CardServiceImpl implements CardService {


	private CardRepository cardRepository;

	public CardServiceImpl(CardRepository cardRepository) {
		super();
		this.cardRepository = cardRepository;
	}

	@Override
	public List<Card> getCards() {
		return cardRepository.findAll();
	}

	@Override
	public Card saveCard(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public Card getById(int id) {
		return cardRepository.findById(id).get();
	}

	@Override
	public Card saveUpdated(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public void deleteById(Integer id) {
		cardRepository.deleteById(id);

	}
	
    @Override
    public List<Card> findByName(String name) {
        return cardRepository.findByName(name);
    }
    
	
	  @Override public List<Card> findByLetter(String name) { 
		  return cardRepository.findByLetter(name); }
	 
}



