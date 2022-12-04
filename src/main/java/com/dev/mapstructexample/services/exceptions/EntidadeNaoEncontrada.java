package com.dev.mapstructexample.services.exceptions;

import javax.swing.plaf.SeparatorUI;

public class EntidadeNaoEncontrada extends RuntimeException {
    public EntidadeNaoEncontrada(String msg) {
        super(msg);
    }
}
