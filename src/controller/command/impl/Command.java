package controller.command.impl;

import java.util.Map;

public interface Command {

    public void executar(Map<String, Object> params);

}
