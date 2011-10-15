package edu.chalmers.aardvark.util;

public enum StateChanges {
	CONTACT_ADDED, CONTACT_REMOVED, CONTACT_RENAMED, USER_ONLINE, USER_OFFLINE, USER_BLOCKED, USER_UNBLOCKED,

	ENCRYPTION_ENABLED, ENCRYPTION_DISABLED, ENCRYPTION_REQUEST_RECEIVED, ENCRYPTION_REQUEST_SENT,

	NEW_MESSAGE_IN_CHAT, NEW_ENCRYPTED_MESSAGE_IN_CHAT,

	CHAT_OPENED, CHAT_CLOSED,

	SERVER_CONNECTION_LOST, SERVER_CONNECTION_ESTABLISHED, LOGGED_IN, LOGGED_OUT, LOGIN_FAILED, ALIAS_UNAVAILABLE,

	SETTING_UP, STARTING_UP, SHUTTING_DOWN, DONE_SETTING_UP, DONE_STARTING_UP
}
