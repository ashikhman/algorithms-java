package com.ashikhman.alogrithms.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Person is the originator in memento pattern. Person holds personal information.
 */
@Data
@AllArgsConstructor
class Person {

    /**
     * Person's first name.
     */
    private String firstName;

    /**
     * Person's last name.
     */
    private String lastName;

    /**
     * Save returns current person state.
     *
     * @return person state
     */
    public PersonState save() {
        return new PersonState(firstName, lastName);
    }

    /**
     * Restore sets current state to provided one.
     *
     * @param state person state
     */
    public void restore(PersonState state) {
        firstName = state.getFirstName();
        lastName = state.getLastName();
    }
}
