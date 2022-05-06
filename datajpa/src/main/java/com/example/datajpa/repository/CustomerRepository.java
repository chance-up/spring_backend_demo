package com.example.datajpa.repository;

import java.util.List;

import com.example.datajpa.entity.Customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    @Query(value = "SELECT sys FROM ADM_SYS sys WHERE sys.nm = :nm OR sys.id = :id OR sys.tkcgrNm = :tkcgrNm")
    // @Query(value = "SELECT sys FROM ADM_SYS sys WHERE sys.nm = :nm")
    public List<Customer> search(@Param("nm") String nm, @Param("id") String id,
            @Param("tkcgrNm") String tkcgrNm);

    @Query(value = "SELECT sys FROM ADM_SYS sys WHERE sys.nm = :nm")
    public Customer findByName(@Param("nm") String nm);

}
