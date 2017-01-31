package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reserva
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-31T00:32:03.324Z")

public class Reserva   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("usuario")
  private Object usuario = null;

  @JsonProperty("tag")
  private String tag = null;

  public Reserva id(Long id) {
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

  public Reserva usuario(Object usuario) {
    this.usuario = usuario;
    return this;
  }

   /**
   * Get usuario
   * @return usuario
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getUsuario() {
    return usuario;
  }

  public void setUsuario(Object usuario) {
    this.usuario = usuario;
  }

  public Reserva tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reserva reserva = (Reserva) o;
    return Objects.equals(this.id, reserva.id) &&
        Objects.equals(this.usuario, reserva.usuario) &&
        Objects.equals(this.tag, reserva.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, usuario, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reserva {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

