package com.geniusver.protection;

import com.geniusver.entities.Term;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by GeniusV on 4/3/18.
 */
@Projection(name = "termProjection", types = Term.class)
public interface TermProjection {
    Long getId();

    String getValue();
}
