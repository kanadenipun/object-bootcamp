package com.devbootcamp.rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void expectAreaToBe6WhenLength3andBreadth2() {
        assertEquals(6, new Rectangle(3,2).area());
    }

    @Test
    void expectAreaToBe28WhenLength7andBreadth4() {
        assertEquals(28, new Rectangle(7,4).area());
    }
}