package cz.sgconsulting.azfunctionsapp

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController("/api")
class VMController(
) {

    private val log: Logger = LoggerFactory.getLogger(VMController::class.java)

    @GetMapping("/vm/state")
    fun getState(): StateDTO {
        log.info("operation=getStateBegin")
        val state = StateDTO(id = 1, state = "VM app state")
        return state.also {
            log.info("operation=getStateProcessEnd, onpremResponse=$state")
        }
    }
}