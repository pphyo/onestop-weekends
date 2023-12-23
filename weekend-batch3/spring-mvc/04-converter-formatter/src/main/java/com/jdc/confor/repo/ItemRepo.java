package com.jdc.confor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.confor.data.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
