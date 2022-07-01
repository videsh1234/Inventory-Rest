package com.wipro.velocity.service;

import com.wipro.velocity.model.Dealer;
import com.wipro.velocity.repository.DealerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {
	
	@Autowired //DI
	private DealerRepository drepo;
	
	public void saveDealer(Dealer dealer) {
		drepo.save(dealer); //invoke save() method of JPA Repository
		
	}
	
	public Dealer findByEmail(String email) {
		return drepo.findByEmail(email);
		
	}

}
