package org.example.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Data Transfer Object representing error details returned by the API.")
@Data
public class WebErrorDTO {

    @Schema(description = "The unique code representing the specific error.", example = "404")
    private String errorCode;

    @Schema(description = "A descriptive message providing more details about the error.", example = "Resource not found.")
    private String errorMessage;

    @Schema(description = "The timestamp when the error occurred.", example = "2024-10-09T14:30:00Z")
    private String timestamp;

    @Schema(description = "A correlation identifier for tracking the request across multiple systems.", example = "123e4567-e89b-12d3-a456-426614174000")
    private String correlationId;

}
