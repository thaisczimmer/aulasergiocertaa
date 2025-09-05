package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Venda {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;
    public Double valorTotal; 
    public Integer quantidadeTotal;
    public LocalDate horario;
    @ManyToOne
    public Cliente cliente;
    @ManyToOne
    public Funcionario funcionario;
}