package org.example.constants;

public class APIConstants {

    public static final String NOT_IMPLEMENTED = "Not implemented";

    public static class ResponseData {
        // Success Responses
        public static final String OPERATION_SUCCESS_STATUS = "200";
        public static final String OPERATION_SUCCESS_DESCRIPTION = "The operation was successful";

        // Client Errors
        public static final String INVALID_REQUEST_STATUS = "400";
        public static final String INVALID_REQUEST_DESCRIPTION = "The request is invalid";

        public static final String NOT_AUTHENTICATED_STATUS = "401";
        public static final String NOT_AUTHENTICATED_DESCRIPTION = "The user is not authenticated";

        public static final String NOT_AUTHORIZED_STATUS = "403";
        public static final String NOT_AUTHORIZED_DESCRIPTION = "The user is not authorized";

        // Resource Errors
        public static final String RESOURCE_MISSING_FAILURE_STATUS = "404";
        public static final String RESOURCE_MISSING_FAILURE_DESCRIPTION = "The requested resource was not found";

        // Conflict Errors
        public static final String CONCURRENCY_FAILURE_STATUS = "409";
        public static final String CONCURRENCY_FAILURE_DESCRIPTION = "Concurrency conflict occurred";

        // Deleted Resource Errors
        public static final String DELETED_FAILURE_STATUS = "410";
        public static final String DELETED_FAILURE_DESCRIPTION = "The resource has been deleted";

        // Server Errors
        public static final String UNKNOWN_FAILURE_STATUS = "500";
        public static final String UNKNOWN_FAILURE_DESCRIPTION = "An unknown server error occurred";
    }

    public static class SupportedMedia {
        // Media Type Constants
        public static final String JSON = "application/json";
        public static final String XML = "application/xml";
        public static final String TEXT_PLAIN = "text/plain";
    }
}