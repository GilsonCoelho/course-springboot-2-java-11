package br.com.gsc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gsc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
