package com.capgemini.creditcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.creditcard.model.slots;

@Repository
public interface SlotRepository extends JpaRepository<slots, Integer> {

}
