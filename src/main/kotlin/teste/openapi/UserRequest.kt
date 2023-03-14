package teste.openapi

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class UserRequest(
        @field:NotBlank
        @field:Size(max = 10)
        val name: String,
        @field:Email
        val email: String
)