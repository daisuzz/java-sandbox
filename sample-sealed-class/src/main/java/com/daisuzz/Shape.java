package com.daisuzz;

public sealed interface Shape permits Circle, Rectangle, Square {

    String s();
}
