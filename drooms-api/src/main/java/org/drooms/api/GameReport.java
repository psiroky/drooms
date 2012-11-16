package org.drooms.api;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public interface GameReport<P extends Playground<N, E>, N extends Node, E extends Edge<N>> {

    public void addTurn(Map<Player, Integer> points);

    public void write(OutputStream s) throws IOException;

}
