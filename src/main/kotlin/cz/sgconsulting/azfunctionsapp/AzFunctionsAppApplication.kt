package cz.sgconsulting.azfunctionsapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AzFunctionsAppApplication

fun main(args: Array<String>) {
	runApplication<AzFunctionsAppApplication>(*args)
}
