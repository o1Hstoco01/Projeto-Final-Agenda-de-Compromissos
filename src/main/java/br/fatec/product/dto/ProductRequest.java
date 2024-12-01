package br.fatec.product.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProductRequest(
    @NotBlank(message = "Nome em branco")
    @Size(min = 3, message = "Tamanho minimo são de 3 caracteres")
    String name,

    @Min(value = 0, message = "preço não pode ser negativo")
    double price,

    @NotBlank(message = "Categoria em branco")
    String category
) {
    
}
