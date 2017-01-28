package pl.sda;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by RENT on 2017-01-28.
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarNotFoundException extends Exception {
}