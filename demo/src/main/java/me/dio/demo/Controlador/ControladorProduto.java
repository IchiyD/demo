package me.dio.demo.Controlador;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.demo.entities.Departamento;
import me.dio.demo.entities.Produto;

@RestController
@RequestMapping(value= "/produtos")
public class ControladorProduto {
    
    @GetMapping
    public List<Produto> getObjects(){
        Departamento d1 = new Departamento(1L, "Food");
        Departamento d2 = new Departamento(2L,"Tech");

        Produto p1 = new Produto(1L, "Hamburguer", 20.0, d1);
        Produto p2 = new Produto(2L, "Pizza", 35.0, d1);
        Produto p3 = new Produto(3L, "AsusVivobook", 2000.0, d2);

        List<Produto> list = Arrays.asList(p1, p2, p3);

        return list;
    }
}
