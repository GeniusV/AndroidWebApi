package com.geniusver.protection;

import com.geniusver.entities.Score;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by GeniusV on 4/3/18.
 */
@Projection(name = "scoreProjection", types = Score.class)
public interface ScoreProjection {
    String getValue();

    StudentProjection getStudent();

    CourseProjection getCourse();

    TermProjection getTerm();
}
