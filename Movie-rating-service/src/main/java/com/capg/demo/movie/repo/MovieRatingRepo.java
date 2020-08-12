package com.capg.demo.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.demo.movie.model.MovieRating;
@Repository
public interface  MovieRatingRepo  extends JpaRepository<MovieRating, Integer>{

}
