package com.crudtest.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity()
@Data
@NoArgsConstructor
public class Human {

  @Id
  private Long id;

  @NotNull
  private String name;

  @NotNull
  @Enumerated(value = EnumType.STRING)
  private Sex sex;
}
