/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alejandro
 */
public class Auto {
    
    private String marca;
    private String color;
    private double peso;
    private int velocidadMax;

    public Auto() {
    }

    public Auto(String marca, String color, double peso, int velocidadMax) {
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.velocidadMax=velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getVelocidadMax(){
    return velocidadMax;
    
    }
    
    public void setVelocidadMax(int velocidadMax){
    this.velocidadMax=velocidadMax;
    }
    
    
}
