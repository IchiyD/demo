package me.dio.demo.entities;

public class Produto {
    
    private Long id;
    private Double price;

    private Departamento department;

    public Produto(){
    }

    public Produto(Long id, String nome, Double price, Departamento department){
        this.id = id;
        this.price = price;
        this.department = department;

    }

    public Long getId(){
        return id;
    }
    public void setName(String nome){
    }
    public Double getPreco(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Departamento getDepartment(){
        return department;
    } 
    public void setDepartment(Departamento department){
        this.department = department;
    }
}
