package com.miniproject.SwapPortal.dto;

import jakarta.validation.constraints.NotNull;

public record SwapRequestDTO(
        @NotNull Long recipientId,
        String applicantMessage
) {}
