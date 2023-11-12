package com.hexaware.bookmovieticket.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.bookmovieticket.entities.Ticket;

public class TicketServiceImp implements ITicketService {

	@Override
	public int insertTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Ticket getByTicketId(int ticketId) {
		// TODO Auto-generated method stub
		Ticket ticket=new Ticket(501, 201, LocalDate.of(2023,11,5), LocalTime.of(11,30), "B-10");
		return ticket;
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		List<Ticket> tickets=new  ArrayList<Ticket>();
		Ticket ticket=new Ticket(501, 201, LocalDate.of(2023,11,5), LocalTime.of(11,30), "B-10");
		Ticket ticket1=new Ticket(502, 201, LocalDate.of(2023,11,5), LocalTime.of(2,30), "D-12");
		Ticket ticket2=new Ticket(503, 202, LocalDate.of(2023,11,5), LocalTime.of(6,30), "F-6");


		tickets.add(ticket);
		tickets.add(ticket1);
		tickets.add(ticket2);
		
		return tickets;
	}

}
