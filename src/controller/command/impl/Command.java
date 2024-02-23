package controller.command.impl;

import java.util.Map;

/**
 * The interface Command.
 */
public interface Command {

    /**
     * Executar.
     *
     * @param params the params
     */
    public void executar(Map<String, Object> params);

}
