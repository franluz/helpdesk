package com.exemple.helpdesk.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.exemple.helpdesk.enums.PriorityEnum;
import com.exemple.helpdesk.enums.StatusEnum;

@Document
public class Ticket {

	@Id
	private String id;
	@DBRef(lazy = true)
	private User user;

	private Date date;

	private String titulo;

	private Integer number;
	
	private StatusEnum status;

	private PriorityEnum priority;
	@DBRef(lazy = true)
	private User assingnedUser;

	private String description;

	private String image;

	private List<ChangeStatus> changes;
}
