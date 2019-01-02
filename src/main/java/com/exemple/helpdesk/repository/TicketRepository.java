package com.exemple.helpdesk.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.exemple.helpdesk.entity.Ticket;
import com.exemple.helpdesk.entity.User;

public interface TicketRepository extends MongoRepository<Ticket, String> {
	
	public Page<Ticket> findByUserIdOrderByDateDesc(Pageable page, User user);
	public Page<Ticket> findByNumber(Pageable page, Integer number);

	
	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc
	(String title,String status,String priority,Pageable pages);
	
	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc
	(String title,String status,String priority,Pageable pages,User user);
	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssingnedUserIdOrderByDateDesc
	(String title,String status,String priority,Pageable pages,User assingnedUser);
}
