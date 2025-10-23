package co.edu.escuelaing.api_gateway.controller;

import co.edu.escuelaing.api_gateway.client.MonolithClient;
import co.edu.escuelaing.api_gateway.model.Arrival;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/arrivals")
@CrossOrigin(origins = "*")
public class ArrivalGatewayController {

    private final MonolithClient monolithClient;

    public ArrivalGatewayController(MonolithClient monolithClient) {
        this.monolithClient = monolithClient;
    }

    @PostMapping
    public Arrival registerArrival(@RequestParam String name) {
        return monolithClient.registerArrival(name);
    }

    @GetMapping
    public List<Arrival> getArrivals() {
        return monolithClient.getArrivals();
    }
}
