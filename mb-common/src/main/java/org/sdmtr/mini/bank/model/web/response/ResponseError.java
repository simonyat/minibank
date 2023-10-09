package org.sdmtr.mini.bank.model.web.response;

import java.io.Serializable;

/**
 * Класс обертка для отправки в ответе на запрос кода ошибки и текстового сообщения об ошибке.
 *
 * @param code - код ошибки.
 * @param message - сообщение об ошибке.
 */
public record ResponseError(String code, String message) implements Serializable {

}
