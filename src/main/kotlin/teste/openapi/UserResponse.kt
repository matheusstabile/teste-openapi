package teste.openapi

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

class UserResponse(val name: String, val email: String, @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss") val createDate: LocalDateTime = LocalDateTime.now())