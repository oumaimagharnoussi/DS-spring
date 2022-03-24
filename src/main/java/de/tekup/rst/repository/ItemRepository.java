package de.tekup.rst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.rst.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
