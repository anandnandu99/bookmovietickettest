package com.hexaware.bookmovieticket.entities;

import java.util.Objects;

public class Theatre {
	private long theatreId;
    private String theatreName;
    private String theatreCity;
    
	public Theatre() {
		super();
	}

	public Theatre(long theatreId, String theatreName, String theatreCity) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
	}

	public long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(theatreCity, theatreId, theatreName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatre other = (Theatre) obj;
		return Objects.equals(theatreCity, other.theatreCity) && theatreId == other.theatreId
				&& Objects.equals(theatreName, other.theatreName);
	}
    
}
