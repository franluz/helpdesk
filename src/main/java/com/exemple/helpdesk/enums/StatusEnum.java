package com.exemple.helpdesk.enums;

public enum StatusEnum {
	New, Resolved, Assigned, Aproved, Desaproved, Closed;

	public static StatusEnum getStatusEnum(String status) {
		switch (status) {
		case "New":
			return New;
		case "Resolved":
			return Resolved;
		case "Assigned":
			return Assigned;
		case "Aproved":
			return Aproved;
		case "Desaproved":
			return Desaproved;
		case "Closed":
			return Closed;

		default:
			return New;
		}
	}

}
