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
    public void writeLine(String Line);

    /**
     * Stop writing process
     */
    public void stop();
}
