package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;
    public Double preco; 
    public Integer quantidade;
    public String nome;
    public LocalDate validade;
    @ManyToOne
    public Categoria categoria;
    @ManyToOne
    public Fabricante fabricante;
}

