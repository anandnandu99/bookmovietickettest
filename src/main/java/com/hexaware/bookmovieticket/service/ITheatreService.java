package com.hexaware.bookmovieticket.service;

import java.util.List;
import com.hexaware.bookmovieticket.entities.Theatre;

public interface ITheatreService {
    public int insertTheatre(Theatre theatre);
    public int updateTheatre(Theatre theatre);
    public int deleteTheatre(int theatreId);
    public Theatre getByTheatreId(int theatreId);
    public List<Theatre> getAllTheatres();
}
