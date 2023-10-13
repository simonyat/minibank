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

}
