package io;

/**
 * Created by Venelin on 18.4.2017 г..
 */
public interface Writer {

    void write(String text);

    void write(String text, Object... params);
}
