package main.java.com.cpjavaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.cpjavaproject.controller.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
