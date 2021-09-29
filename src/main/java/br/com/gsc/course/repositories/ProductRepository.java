package br.com.gsc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gsc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
