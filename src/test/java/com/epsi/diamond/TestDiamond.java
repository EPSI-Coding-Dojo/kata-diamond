package com.epsi.diamond;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiamond {

    @Test
    public void canCreateASingleCharDiamond() {
        Diamond diamond = new Diamond('A');
        assertEquals("A", diamond.toString());
    }

    @Test
    public void canCreateATwoCharDiamond() {
        Diamond diamond = new Diamond('B');
        String diamondRepresentation =
                " A\n" +
                "B B\n" +
                " A";
        assertEquals(diamondRepresentation, diamond.toString());
    }
    @Test
    public void canCreateAThreeCharDiamond() {
        Diamond diamond = new Diamond('C');
        String diamondRepresentation =
                "  A\n" +
                " B B\n" +
                "C   C\n" +
                " B B\n" +
                "  A";
        assertEquals(diamondRepresentation, diamond.toString());
    }

    public static void main(String arg[]) {
        Diamond diamond = new Diamond('W');
        System.out.println(diamond);
    }
}
