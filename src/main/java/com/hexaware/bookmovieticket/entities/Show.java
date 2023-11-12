package com.hexaware.bookmovieticket.entities;

import java.time.LocalTime;
import java.util.Objects;

public class Show {
	
	    private int showId;
	    private String showName;
	    private LocalTime showTime;
	    
		public Show() {
			super();
		}
		public Show(int showId, String showName, LocalTime showTime) {
			super();
			this.showId = showId;
			this.showName = showName;
			this.showTime = showTime;
		}
		public int getShowId() {
			return showId;
		}
		public void setShowId(int showId) {
			this.showId = showId;
		}
		public String getShowName() {
			return showName;
		}
		public void setShowName(String showName) {
			this.showName = showName;
		}
		public LocalTime getShowTime() {
			return showTime;
		}
		public void setShowTime(LocalTime showTime) {
			this.showTime = showTime;
		}
		@Override
		public String toString() {
			return "Show [showId=" + showId + ", showName=" + showName + ", showTime=" + showTime + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(showId, showName, showTime);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Show other = (Show) obj;
			return showId == other.showId && Objects.equals(showName, other.showName)
					&& Objects.equals(showTime, other.showTime);
		}
}
	    
	    
		