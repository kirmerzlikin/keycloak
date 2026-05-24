package org.keycloak.admin.client.token;

import jakarta.annotation.Nonnull;

import org.keycloak.OAuth2Constants;

public class ClientAssertion {

	private final String type;
	private final String value;

	public static ClientAssertion jwt(@Nonnull String jwt) {
		return new ClientAssertion(OAuth2Constants.CLIENT_ASSERTION_TYPE_JWT, jwt);
	}

	public ClientAssertion(@Nonnull String type, @Nonnull String value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}
}
