package com.vietnam.history.gui.loader;

import com.vietnam.history.gui.model.Figure;

/**
 * A class for loading historical figure data from JSON files.
 */
public class FigureLoader extends DataLoader<Figure> {
    private static final String FOLDER_PATH = "src/data/figures";

    /**
     * Constructs a new {@code FigureLoader}.
     */
    public FigureLoader() {
        super(FOLDER_PATH);
    }


    @Override
    protected Class<Figure> getType() {
        return Figure.class;
    }
}
