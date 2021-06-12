package com.eduardo.crud.data.vo;

import com.eduardo.crud.entity.Produto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.modelmapper.ModelMapper;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonPropertyOrder({"id","nome","estoque","preco"})
public class ProdutoVO implements Serializable {

    private static final long serialVersionUID = -7210079095998657096L;

    @JsonPropertyOrder("id")
    private Long id;
    @JsonPropertyOrder("nome")
    private String nome;
    @JsonPropertyOrder("estoque")
    private Integer estoque;
    @JsonPropertyOrder("preco")
    private Double preco;

    public static ProdutoVO create(Produto produto) {
        return new ModelMapper().map(produto, ProdutoVO.class);
    }

}
