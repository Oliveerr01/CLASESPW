package Utils;

import java.lang.module.ResolutionException;

public class ResultadoException extends ResolutionException {
    // metodos - attr public


    public ResultadoException() {
    }

    public ResultadoException(String message) {
        super(message);
    }
}