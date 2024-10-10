package org.example.course.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Data Transfer Object representing a course.")
@Data
public class CourseDTO {

    @Schema(description = "The unique identifier of the course.", example = "101")
    private Long courseId;

    @Schema(description = "The name of the course.", example = "Introduction to Java Programming")
    private String courseName;

}
