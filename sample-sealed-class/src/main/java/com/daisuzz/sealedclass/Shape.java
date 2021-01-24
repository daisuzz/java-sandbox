package com.daisuzz.sealedclass;

public sealed interface Shape permits Circle, Rectangle, Square {

    String s();
}
