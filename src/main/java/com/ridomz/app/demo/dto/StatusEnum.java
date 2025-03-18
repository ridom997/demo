package com.ridomz.app.demo.dto;

public enum StatusEnum {
    ACTIVE("ID","ACTIVE"),
    INACTIVE("ID","INACTIVE"),
    PENDING("ID","PENDING"),
    SUSPENDED("ID","SUSPENDED"),
    DELETED("ID","DELETED"),
    ARCHIVED("ID","ARCHIVED"),
    VERIFIED("ID","VERIFIED"),
    UNVERIFIED("ID","UNVERIFIED"),
    BANNED("ID","BANNED"),
    EXPIRED("ID","EXPIRED"),
    CONFIRMED("ID","CONFIRMED"),
    PROCESSING("ID","PROCESSING"),
    COMPLETED("ID","COMPLETED"),
    CANCELED("ID","CANCELED"),
    REFUNDED("ID","REFUNDED"),
    AVAILABLE("ID","AVAILABLE"),
    UNAVAILABLE("ID","UNAVAILABLE"),
    OUT_OF_STOCK("ID","OUT_OF_STOCK"),
    RESERVED("ID","RESERVED"),
    DISCONTINUED("ID","DISCONTINUED");

    private String id;
    private String description;

    StatusEnum(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static StatusEnum fromString(String status) {
        for (StatusEnum s : StatusEnum.values()) {
            if (s.name().equalsIgnoreCase(status)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid status: " + status);
    }
}
