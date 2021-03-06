package feature.paises;

import javax.validation.constraints.NotBlank;

public class CadastrarPaisFormObject {

    @NotBlank
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais toEntity() {
        return new Pais(this.nome);
    }
}
