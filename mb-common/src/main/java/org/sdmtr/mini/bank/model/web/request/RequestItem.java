package org.sdmtr.mini.bank.model.web.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record RequestItem<T>(@JsonInclude(value = JsonInclude.Include.NON_NULL) T data) implements Serializable {

    @JsonCreator
    public RequestItem(@JsonProperty("data") T data) {
        this.data = data;
    }

    @Override
    public T data() {
        return this.data;
    }

}
