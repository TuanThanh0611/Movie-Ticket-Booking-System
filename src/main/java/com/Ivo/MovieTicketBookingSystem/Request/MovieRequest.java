package com.Ivo.MovieTicketBookingSystem.Request;

import com.Ivo.MovieTicketBookingSystem.enums.Language;
import lombok.Data;

import java.util.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date genre;
    private Language langua;
}
