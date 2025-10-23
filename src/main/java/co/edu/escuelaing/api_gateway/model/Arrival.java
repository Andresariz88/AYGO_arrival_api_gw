package co.edu.escuelaing.api_gateway.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Arrival {
    private String id;
    private String name;
    private LocalDateTime timestamp;
}