package co.edu.escuelaing.parcial.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParcialController {

  private static final String template = "Hello, %s!";

  @GetMapping("/primos")
  public Primos greeting(@RequestParam(defaultValue = "World") String name) {
    return new Primos(
      int primoInicial = 1;
    );
  }

  @GetMapping("/factores")
  public factores greeting(@RequestParam(defaultValue = "World") String name) {
    return new factores(counter.incrementAndGet(), template.formatted(name));
  }
}