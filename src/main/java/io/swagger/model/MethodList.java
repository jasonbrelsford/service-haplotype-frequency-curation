package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Method;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MethodList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T15:23:31.951-06:00")

public class MethodList  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Method")
  private List<Method> method = null;

  public MethodList method(List<Method> method) {
    this.method = method;
    return this;
  }

  public MethodList addMethodItem(Method methodItem) {
    if (this.method == null) {
      this.method = new ArrayList<Method>();
    }
    this.method.add(methodItem);
    return this;
  }

   /**
   * list of methods
   * @return method
  **/
  @ApiModelProperty(value = "list of methods")

  @Valid

  public List<Method> getMethod() {
    return method;
  }

  public void setMethod(List<Method> method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MethodList methodList = (MethodList) o;
    return Objects.equals(this.method, methodList.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MethodList {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

