package cz.sgconsulting.azfunctionsapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class AzFunctionsAppApplication

fun main(args: Array<String>) {
	SpringApplication.run(AzFunctionsAppApplication::class.java, *args)
}