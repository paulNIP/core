package com.opolos.core.models.products;
import org.hibernate.annotations.GenerationTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "product_barcodes", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "uuid")
    })
public class BarCode {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  private long id;

  @NotBlank
  private String uuid;

  @NotBlank
  private String company;

  @NotBlank
  private String product_id;

  @NotBlank
  private String created_at;

  @NotBlank
  @Size(max = 120)
  private String instance_name;

  public BarCode() {
  }

  public BarCode(String uuid,String company,String product_id,String created_at,String instance_name
  ) {
    this.uuid =uuid;
    this.company =company;
    this.product_id =product_id;
    this.created_at = created_at;
    this.instance_name =instance_name;
  }



    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getInstance_name() {
        return instance_name;
    }

    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name;
    }

  
}

