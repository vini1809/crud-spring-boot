package com.orusys.crudspringboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.orusys.crudspringboot.entity.Crud;

@Repository
@Transactional
public interface CrudRepository extends JpaRepository<Crud, Integer> {
    List<Crud> findByTitleContainingIgnoreCase(String keyword);

    @Query("UPDATE Tutorial t SET t.published = :published WHERE t.id = :id")
    @Modifying
    public void updatePublishedStatus(Integer id, boolean published);
}