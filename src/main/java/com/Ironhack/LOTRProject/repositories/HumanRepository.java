package com.Ironhack.LOTRProject.repositories;

import com.Ironhack.LOTRProject.dao.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {


}
