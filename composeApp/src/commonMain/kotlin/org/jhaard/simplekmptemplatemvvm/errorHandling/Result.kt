package org.jhaard.simplekmptemplatemvvm.errorHandling


sealed class Result<out T> {

    //Operation completed successfully with data
    data class Success<T>(val data: T) : Result<T>()

    //Operation failed with an error
    data class Error(
        val message: String,
        val throwable: Throwable? = null,
        val errorType: ErrorType = ErrorType.UNKNOWN
    ) : Result<Nothing>()


    //Operation is in progress
    data object Loading : Result<Nothing>()


    // Enum categories of errors for more specific handling
    enum class ErrorType {
        NETWORK,        // No internet, timeout, connection issues
        SERVER,         // 4xx, 5xx responses
        AUTHENTICATION, // 401, 403 - user not authorized
        VALIDATION,     // Invalid input data
        NOT_FOUND,      // 404 - resource doesn't exist
        UNKNOWN         // Unexpected errors
    }

}