package com.hexaware.bookmovieticket.service;

import java.util.List;

import com.hexaware.bookmovieticket.entities.Ticket;

	public interface ITicketService {
	    int insertTicket(Ticket ticket);
	    int updateTicket(Ticket ticket);
	    int deleteTicket(int ticketId);
	    Ticket getByTicketId(int ticketId);
	    List<Ticket> getAllTickets();
	}


