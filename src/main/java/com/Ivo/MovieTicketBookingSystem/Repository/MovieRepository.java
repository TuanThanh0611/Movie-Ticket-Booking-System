package com.Ivo.MovieTicketBookingSystem.Repository;

import com.Ivo.MovieTicketBookingSystem.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
