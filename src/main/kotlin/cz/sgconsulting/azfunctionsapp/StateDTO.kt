package cz.sgconsulting.azfunctionsapp

import com.fasterxml.jackson.annotation.JsonProperty

data class StateDTO (
    val id: Long? = null,
    var state: String? = null
)

