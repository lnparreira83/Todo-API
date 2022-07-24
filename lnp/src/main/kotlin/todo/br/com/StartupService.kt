package todo.br.com

import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import todo.br.com.model.User
import todo.br.com.repository.UserRepository

@Singleton
class StartupService (private val userRepository: UserRepository){

    private val log = LoggerFactory.getLogger(StartupService::class.java)

    @EventListener
    fun onStartupEvent(event: StartupEvent){
      val user = userRepository.save(User(191,"123456"))
        log.info("Usuario adicionado: {}", user)
    }
}