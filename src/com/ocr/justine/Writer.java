package com.ocr.justine;

public interface Writer {

    /**
     * Start writing process
     */
    public void start();

    /**
     * Write one line
     * @param Line
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();
}
