package io.thekraken.grok.configuration.model;

public class Output {

  public String location;
  public String type;

  public Output() {}

  public Output(String type, String location) {
    this.location = location;
    this.type = type;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
}
