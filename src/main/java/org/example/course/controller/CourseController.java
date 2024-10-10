package org.example.course.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.common.dto.WebErrorDTO;
import org.example.constants.APIConstants;
import org.example.course.dto.CourseDTO;
import org.example.course.dto.GetCoursesResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Course")
@RequestMapping("/api/courses")
public class CourseController {
    @Operation(summary = "Initialize application", description = "Initializes the application with the provided launch context, course, and integration details.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = APIConstants.ResponseData.OPERATION_SUCCESS_STATUS, description = APIConstants.ResponseData.OPERATION_SUCCESS_DESCRIPTION, headers = {
                    @Header(schema = @Schema(implementation = String.class), name = "correlation-id", description = "Identifier intended to correlate multi system requests", required = true)}),
            @ApiResponse(responseCode = APIConstants.ResponseData.INVALID_REQUEST_STATUS, description = APIConstants.ResponseData.INVALID_REQUEST_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.NOT_AUTHENTICATED_STATUS, description = APIConstants.ResponseData.NOT_AUTHENTICATED_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.NOT_AUTHORIZED_STATUS, description = APIConstants.ResponseData.NOT_AUTHORIZED_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.RESOURCE_MISSING_FAILURE_STATUS, description = APIConstants.ResponseData.RESOURCE_MISSING_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.CONCURRENCY_FAILURE_STATUS, description = APIConstants.ResponseData.CONCURRENCY_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.DELETED_FAILURE_STATUS, description = APIConstants.ResponseData.DELETED_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.UNKNOWN_FAILURE_STATUS, description = APIConstants.ResponseData.UNKNOWN_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))), })
    @GetMapping( value = "/get", consumes = { APIConstants.SupportedMedia.JSON })
    public GetCoursesResponseDTO get() {
        throw new UnsupportedOperationException(APIConstants.NOT_IMPLEMENTED);
    }

    @Operation(summary = "Create a new course", description = "Creates a new course with the provided course details.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = APIConstants.ResponseData.OPERATION_SUCCESS_STATUS, description = APIConstants.ResponseData.OPERATION_SUCCESS_DESCRIPTION, headers = {
                    @Header(schema = @Schema(implementation = String.class), name = "correlation-id", description = "Identifier intended to correlate multi system requests", required = true)}),
            @ApiResponse(responseCode = APIConstants.ResponseData.INVALID_REQUEST_STATUS, description = APIConstants.ResponseData.INVALID_REQUEST_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.NOT_AUTHENTICATED_STATUS, description = APIConstants.ResponseData.NOT_AUTHENTICATED_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.NOT_AUTHORIZED_STATUS, description = APIConstants.ResponseData.NOT_AUTHORIZED_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.RESOURCE_MISSING_FAILURE_STATUS, description = APIConstants.ResponseData.RESOURCE_MISSING_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.CONCURRENCY_FAILURE_STATUS, description = APIConstants.ResponseData.CONCURRENCY_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.DELETED_FAILURE_STATUS, description = APIConstants.ResponseData.DELETED_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
            @ApiResponse(responseCode = APIConstants.ResponseData.UNKNOWN_FAILURE_STATUS, description = APIConstants.ResponseData.UNKNOWN_FAILURE_DESCRIPTION, content = @Content(schema = @Schema(implementation = WebErrorDTO.class))),
    })
    @PostMapping(value = "/create", consumes = { APIConstants.SupportedMedia.JSON }, produces = { APIConstants.SupportedMedia.JSON })
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO) {
        throw new UnsupportedOperationException(APIConstants.NOT_IMPLEMENTED);
    }
}
