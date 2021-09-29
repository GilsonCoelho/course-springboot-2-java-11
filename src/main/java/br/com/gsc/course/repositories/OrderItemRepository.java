package br.com.gsc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gsc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
