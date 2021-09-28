package br.com.gsc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gsc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
