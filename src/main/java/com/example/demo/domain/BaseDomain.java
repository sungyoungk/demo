package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDomain {

    public LocalDateTime createdDate;
    public LocalDateTime updatedDate;
    public String createdBy;
    public String updatedBy;
}
