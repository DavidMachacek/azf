package cz.sgconsulting.azfunctionsapp

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController("/api")
class AZFController(
) {

    private val log: Logger = LoggerFactory.getLogger(AZFController::class.java)

    @GetMapping("/azf/state")
    fun getState(): StateDTO {
        log.info("operation=getStateBegin")
        val state = StateDTO(id = 1, state = "Azure Functions state")
        return state.also {
            log.info("operation=getStateProcessEnd, onpremResponse=$state")
        }
    }
}