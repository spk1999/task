package com.sujan.task.repo;

import com.sujan.task.model.Vehicle;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {




}
