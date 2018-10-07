package org.academiadecodigo.bootcamp.gameobjects.grid;

import org.academiadecodigo.bootcamp.gameobjects.brick.Brick;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class StackGrid extends Grid{
    public StackGrid(int cols, int rows, Color color) {
        super(cols, rows, color);
    }

    public boolean ReceiveBrick(Brick brick){
        return false;
    }
}
