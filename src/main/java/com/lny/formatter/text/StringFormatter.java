package com.lny.formatter.text;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public abstract class StringFormatter {

    protected Integer limit;
    protected Boolean justify;

    public StringFormatter() {
        this.limit = 40;
        this.justify = true;
    }

    /**
     * It receives a text and should return it formatted
     *
     * @param text    a {@link String} to be formatted.
     * @param limit   a {@link Integer} for a line limit.
     * @param justify a {@link Boolean} to choose if it will be justified. By default is true.
     * @return the {@link String} formatted.
     */
    public abstract String format(String text, Integer limit, Boolean justify);
}
