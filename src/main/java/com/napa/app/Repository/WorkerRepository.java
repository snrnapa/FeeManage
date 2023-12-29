package com.napa.app.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.M_Worker;

@Repository
public interface WorkerRepository extends JpaRepository<M_Worker, Integer> {

    @Query("select o from M_Worker o where o.id = :id")
    M_Worker findByPrimarykeys(@Param("id") Integer id);

}
