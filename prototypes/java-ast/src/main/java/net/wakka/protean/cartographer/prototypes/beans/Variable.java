package net.wakka.protean.cartographer.prototypes.beans;

public class Variable extends Node {

  public Variable() {
    super();
    setType("variable");
  }

  private String valueType;

  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

}
