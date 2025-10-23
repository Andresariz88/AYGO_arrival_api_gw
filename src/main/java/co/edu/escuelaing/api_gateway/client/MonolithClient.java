package co.edu.escuelaing.api_gateway.client;

import co.edu.escuelaing.api_gateway.model.Arrival;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(
        name = "monolith",
        url = "${monolith.api.url}"
)
public interface MonolithClient {

    @PostMapping
    Arrival registerArrival(@RequestParam String name);

    @GetMapping
    List<Arrival> getArrivals();
}