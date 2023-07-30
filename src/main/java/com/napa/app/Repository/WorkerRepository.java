package com.napa.app.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {

    @Query("select o from Worker o where o.id = :id")
    Worker findByPrimarykeys(@Param("id") Integer id);

}
