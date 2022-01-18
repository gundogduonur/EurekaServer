package com.gundogduonur.courseapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private String courseId;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "author_name")
    private String authorName;


}
