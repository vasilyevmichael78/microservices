package com.mikdrums.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {


}
