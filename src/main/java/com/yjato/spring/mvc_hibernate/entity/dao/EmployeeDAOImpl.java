package com.yjato.spring.mvc_hibernate.entity.dao;

import com.yjato.spring.mvc_hibernate.entity.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @PersistenceContext
    EntityManager entityManager;



    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee",Employee.class).getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void deleteEmployee(int id) {
        entityManager.createQuery("delete from Employee where id=:id").setParameter("id",id).executeUpdate();
    }
}
