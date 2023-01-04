package org.sezamin.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
