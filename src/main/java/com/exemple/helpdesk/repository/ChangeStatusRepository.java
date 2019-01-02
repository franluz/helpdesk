package com.exemple.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exemple.helpdesk.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	public Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);

}
