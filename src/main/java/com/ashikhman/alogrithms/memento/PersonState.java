package com.ashikhman.alogrithms.memento;

import lombok.Data;

/**
 * PersonState represents conserved data about persons.
 */
@Data
public class PersonState {

    /**
     * Person's first name.
     */
    private final String firstName;

    /**
     * Person's last name.
     */
    private final String lastName;
}
