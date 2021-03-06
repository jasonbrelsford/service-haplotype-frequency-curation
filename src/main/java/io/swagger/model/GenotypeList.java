package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Genotype;
import io.swagger.model.License;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of Genotypes
 */
@ApiModel(description = "List of Genotypes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T15:23:31.951-06:00")

public class GenotypeList  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("License")
  private License license = null;

  @JsonProperty("Genotype")
  private List<Genotype> genotype = null;

  public GenotypeList license(License license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")

  @Valid

  public License getLicense() {
    return license;
  }

  public void setLicense(License license) {
    this.license = license;
  }

  public GenotypeList genotype(List<Genotype> genotype) {
    this.genotype = genotype;
    return this;
  }

  public GenotypeList addGenotypeItem(Genotype genotypeItem) {
    if (this.genotype == null) {
      this.genotype = new ArrayList<Genotype>();
    }
    this.genotype.add(genotypeItem);
    return this;
  }

   /**
   * Additional Information on genotype
   * @return genotype
  **/
  @ApiModelProperty(value = "Additional Information on genotype")

  @Valid

  public List<Genotype> getGenotype() {
    return genotype;
  }

  public void setGenotype(List<Genotype> genotype) {
    this.genotype = genotype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenotypeList genotypeList = (GenotypeList) o;
    return Objects.equals(this.license, genotypeList.license) &&
        Objects.equals(this.genotype, genotypeList.genotype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, genotype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenotypeList {\n");
    
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    genotype: ").append(toIndentedString(genotype)).append("\n");
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

