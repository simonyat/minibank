package org.sdmtr.mini.bank.model.web.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 * Класс обертка для запросов к сервисам мини банка.
 *
 * @param data - объекта запроса.
 * @param <T> - тип запроса.
 */
public record RequestItem<T>(@JsonInclude(value = JsonInclude.Include.NON_NULL) T data) implements Serializable {

}
