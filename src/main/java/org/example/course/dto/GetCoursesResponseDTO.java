package org.example.course.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "Data Transfer Object representing a get courses response .")
@Data
public class GetCoursesResponseDTO {

    @Schema(description = "The list of courses.")
    private List<CourseDTO> courses;
}
