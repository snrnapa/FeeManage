package com.napa.app.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Effort;
import com.napa.app.entity.EffortPK;

@Repository
public interface EffortRepository extends JpaRepository<Effort, EffortPK> {

	@Query("select o from Effort o where o.id = :id")
	List<Effort> findByPrimarykeys(@Param("id") int id);

}
