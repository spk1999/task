package com.sujan.task.repo;

import com.sujan.task.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LocationRepo extends JpaRepository<Location,Integer> {
}
