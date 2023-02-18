package com.globomatics.bike.repositories;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
// * JpaRepository helps me to make DML (CRUD) actions like CREATE, UPDATE, DELETE
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
