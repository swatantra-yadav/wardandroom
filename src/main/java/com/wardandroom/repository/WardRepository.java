package com.wardandroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wardandroom.entities.Ward;

@Repository
public interface WardRepository extends JpaRepository<Ward, Integer> {

}
