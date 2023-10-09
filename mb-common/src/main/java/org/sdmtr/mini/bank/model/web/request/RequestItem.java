package org.sdmtr.mini.bank.model.web.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * Класс обертка для запросов к сервисам мини банка.
 *
 * @param data - объекта запроса.
 * @param <T> - тип запроса.
 */
public record RequestItem<T>(@JsonInclude(value = JsonInclude.Include.NON_NULL) T data) implements Serializable {

    @JsonCreator
    public RequestItem(@JsonProperty("data") T data) {
        this.data = data;
    }

    @Override
    public T data() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestItem<?> that = (RequestItem<?>) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

}
