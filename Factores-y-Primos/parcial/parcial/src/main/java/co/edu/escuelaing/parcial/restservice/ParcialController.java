package co.edu.escuelaing.parcial.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParcialController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/primos")
  public Primos greeting(@RequestParam(defaultValue = "World") String name) {
    return new Primos(counter.incrementAndGet(), template.formatted(name));
  }

  @GetMapping("/factores")
  public factores greeting(@RequestParam(defaultValue = "World") String name) {
    return new factores(counter.incrementAndGet(), template.formatted(name));
  }
}