package com.example.samplepncapp.repository;

import com.example.samplepncapp.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE p.name = :pname")
    public Collection<Person> findByNameCustom(@Param("pname") String pname);


}
