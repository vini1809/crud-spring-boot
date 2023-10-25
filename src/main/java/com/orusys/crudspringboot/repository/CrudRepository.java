package com.orusys.crudspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orusys.crudspringboot.model.Crud;

public interface CrudRepository extends JpaRepository<Crud, Long> {
    List<Crud> findByPublished(boolean published);

    List<Crud> findByTitleContaining(String title);
}
