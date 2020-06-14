package com.ashikhman.algrithms.memento;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonControllerTest {
    @Test
    public void givenPersonChangeItsState_whenUndo_thenReturnToPreviousState() {
        // Given
        var person = new Person("John", "Wick");
        var controller = new PersonController(person);

        // When
        person.setLastName("Cash");
        controller.save();
        person.setFirstName("Milla");
        person.setLastName("Jovovich");
        controller.undo();

        // Then
        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getLastName()).isEqualTo("Cash");
    }
}
