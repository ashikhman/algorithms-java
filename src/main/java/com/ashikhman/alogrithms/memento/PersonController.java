package com.ashikhman.alogrithms.memento;

import lombok.RequiredArgsConstructor;

/**
 * PersonController is the caretaker for a person.
 */
@RequiredArgsConstructor
public class PersonController {

    /**
     * Controlling person object.
     */
    private final Person person;

    /**
     * Controller person's saved state.
     */
    private PersonState savedState;

    /**
     * Saves current person's state.
     */
    public void save() {
        savedState = person.save();
    }

    /**
     * Sets current person's state to the saved one.
     */
    public void undo() {
        person.restore(savedState);
    }
}
