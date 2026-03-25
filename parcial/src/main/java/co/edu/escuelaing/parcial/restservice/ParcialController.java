package co.edu.escuelaing.parcial.restservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParcialController {
 
  private static final int firtsFactor = 1;
  private static final int firtsPrimo = 1;

  @GetMapping("/primes")
  public ArrayList Primos(@RequestParam(defaultValue = "Numero n") int primo) {
    if(primo/primo == int && primo/1 == int){
      return primo;
    } 
  }

  @GetMapping("/factors")
  public ArrayList factores(@RequestParam(defaultValue = "Numero n") int modulo) {
    if(modulo/2 == int){
      return listFactores;
    }
  }
}