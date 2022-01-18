package com.gundogduonur.courseapp.repository;

import com.gundogduonur.courseapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {

}
