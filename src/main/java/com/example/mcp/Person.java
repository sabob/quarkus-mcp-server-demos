package com.example.mcp;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import jakarta.validation.constraints.NotBlank;

@JsonClassDescription("Foo")
class Person {

    @NotBlank
    @JsonPropertyDescription("Bar")
    @JsonProperty(required = true)
    public String name;
}
