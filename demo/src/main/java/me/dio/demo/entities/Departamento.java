package me.dio.demo.entities;


public class Departamento {
    private Long id;
    private String nome;

    public Departamento(){
    }

    public Departamento(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return nome;
    }
    public void setName(String nome){
        this.nome = nome;
    }
}
