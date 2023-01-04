package com.capgemini.creditcard.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.creditcard.model.appointmentslots;

@Repository
public interface Appointmentslotsrepository extends JpaRepository<appointmentslots, String> {

}
