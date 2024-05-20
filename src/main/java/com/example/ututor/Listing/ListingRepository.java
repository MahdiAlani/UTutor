package com.example.ututor.Listing;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListingRepository extends JpaRepository<Listing, Long> {
    List<Listing> findByTutorId(Long tutorId);
}
