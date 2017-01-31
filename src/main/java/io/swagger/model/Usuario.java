package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Usuario
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-31T00:32:03.324Z")

public class Usuario   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cpf")
  private String cpf = null;

  public Usuario id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Usuario nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Usuario cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(this.id, usuario.id) &&
        Objects.equals(this.nome, usuario.nome) &&
        Objects.equals(this.cpf, usuario.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

