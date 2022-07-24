package todo.br.com.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import testeapi.br.com.model.Todo

@Repository
interface TodoRepository :JpaRepository <Todo, Long>{
}