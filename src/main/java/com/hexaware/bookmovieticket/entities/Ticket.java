package com.hexaware.bookmovieticket.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Ticket {

	   
	    private int ticketId;
	    private int showId;
	    private LocalDate showDate;
	    private LocalTime showTime;
	    private String seatNo;
	    
		public Ticket() {
			super();
		}

		public Ticket(int ticketId, int showId, LocalDate showDate, LocalTime showTime, String seatNo) {
			super();
			this.ticketId = ticketId;
			this.showId = showId;
			this.showDate = showDate;
			this.showTime = showTime;
			this.seatNo = seatNo;
		}

		public int getTicketId() {
			return ticketId;
		}

		public void setTicketId(int ticketId) {
			this.ticketId = ticketId;
		}

		public int getShowId() {
			return showId;
		}

		public void setShowId(int showId) {
			this.showId = showId;
		}

		public LocalDate getShowDate() {
			return showDate;
		}

		public void setShowDate(LocalDate showDate) {
			this.showDate = showDate;
		}

		public LocalTime getShowTime() {
			return showTime;
		}

		public void setShowTime(LocalTime showTime) {
			this.showTime = showTime;
		}

		public String getSeatNo() {
			return seatNo;
		}

		public void setSeatNo(String seatNo) {
			this.seatNo = seatNo;
		}

		@Override
		public String toString() {
			return "Ticket [ticketId=" + ticketId + ", showId=" + showId + ", showDate=" + showDate + ", showTime="
					+ showTime + ", seatNo=" + seatNo + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(seatNo, showDate, showId, showTime, ticketId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Ticket other = (Ticket) obj;
			return Objects.equals(seatNo, other.seatNo) && Objects.equals(showDate, other.showDate)
					&& showId == other.showId && Objects.equals(showTime, other.showTime) && ticketId == other.ticketId;
		}
	    
}
	    

	    