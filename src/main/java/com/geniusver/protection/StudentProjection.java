package com.geniusver.protection;

import com.geniusver.entities.Score;
import com.geniusver.entities.Student;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by GeniusV on 4/3/18.
 */
@Projection(name = "studentProjection", types = Student.class)
public interface StudentProjection {
    String getName();

    Long getId();
}
