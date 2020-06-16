package com.codemaster.ad.dao;

import com.codemaster.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreativeRepository extends JpaRepository<Creative, Long> {
}