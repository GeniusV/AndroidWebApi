package com.geniusver.protection;

import com.geniusver.entities.Course;
import com.geniusver.entities.Student;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by GeniusV on 4/3/18.
 */
@Projection(name = "courseProjection", types = Course.class)
public interface CourseProjection {
    Long getId();

    String getName();
}
