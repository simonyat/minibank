package org.sdmtr.mini.bank.model.web.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Класс обертка для передачи ответа на запрос.
 *
 * @param status - статус ответа на запрос (SUCCESS, ERROR).
 * @param data - данные ответа на запрос.
 * @param error - обшика, возникшая в процессе обработки запроса.
 * @param <T> - тип ответа на запрос.
 */
public record ResponseItem<T>(
        String status,
        @JsonInclude(value = JsonInclude.Include.NON_NULL) T data,
        @JsonInclude(value = JsonInclude.Include.NON_NULL) ResponseError error) implements Serializable {

}
