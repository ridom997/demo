package com.ridomz.app.demo.dto.response;

import com.ridomz.app.demo.dto.enums.StatusEnum;

public record BusinessTypeResponseRecord(String name, String description, StatusEnum statusEnum) {
}
