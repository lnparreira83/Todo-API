package todo.br.com.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import todo.br.com.model.User

@Repository
abstract class UserRepository : JpaRepository<User, Long>{
}