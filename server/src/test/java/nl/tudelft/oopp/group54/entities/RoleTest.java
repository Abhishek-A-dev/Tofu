package nl.tudelft.oopp.group54.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoleTest {

    Role roleLec;
    Role roleMod;
    Role roleStud;

    @BeforeEach
    void setUp() {
        roleLec = new Role(1, "lecturer");
        roleMod = new Role(2, "moderator");
        roleStud = new Role(3, "student");
    }

    @Test
    public void testEquals() {
        assertEquals(roleLec, roleLec);
    }

    @Test
    public void equalsSameObject() {
        assertEquals(roleLec, roleLec);
    }

    @Test
    public void equalsNull() {
        assertNotEquals(roleMod, null);
    }

    @Test
    public void notEquals() {
        assertNotEquals(roleLec, roleMod);
    }

    @Test
    public void equalsDifferentObject() {
        assertNotEquals(roleLec, "123");
    }
}