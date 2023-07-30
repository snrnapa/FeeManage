package com.napa.app.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

	@Query("select o from Project o where o.projno = :projno")
	Project findByPrimarykeys(@Param("projno") String projno);

}
