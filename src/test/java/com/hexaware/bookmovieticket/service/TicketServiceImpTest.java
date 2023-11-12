package com.hexaware.bookmovieticket.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.bookmovieticket.entities.Ticket;

class TicketServiceImpTest {


    TicketServiceImp service = new TicketServiceImp();

    @Test
    void testInsertTicket() {
        Ticket ticket = new Ticket();
        int actual = service.insertTicket(ticket);
        assertEquals(1, actual);
    }

    @Test
    void testUpdateTicket() {
        Ticket ticket = new Ticket();
        int actual = service.updateTicket(ticket);
        assertEquals(2, actual);
    }

    @Test
    void testDeleteTicket() {
        int actual = service.deleteTicket(2);
        assertEquals(3, actual);
    }

    @Test
    void testGetTicketById() {
        Ticket actual = service.getByTicketId(5);
        Ticket expected = new Ticket(501, 201, LocalDate.of(2023,11,5), LocalTime.of(11,30), "B-10");

        assertEquals(expected, actual);
    }

    @Test
    void testGetAllTickets() {
        List<Ticket> expected = new ArrayList<>();
        expected.add(new Ticket(501, 201, LocalDate.of(2023,11,5), LocalTime.of(11,30), "B-10"));
        expected.add(new Ticket(502, 201, LocalDate.of(2023,11,5), LocalTime.of(2,30), "D-12"));
        expected.add(new Ticket(503, 202, LocalDate.of(2023,11,5), LocalTime.of(6,30), "F-6"));


        List<Ticket> actual = service.getAllTickets();
        assertEquals(expected, actual);
    }


}
