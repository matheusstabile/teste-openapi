package teste.openapi

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/testes")
class RestController {

    @Post
    fun hello(@Valid @Body userRequest: UserRequest) = UserResponse(name = userRequest.name, email = userRequest.email)

}