package org.onebusaway.gtfs.model;

import org.onebusaway.csv_entities.schema.annotations.CsvField;
import org.onebusaway.csv_entities.schema.annotations.CsvFields;
import org.onebusaway.gtfs.serialization.mappings.DefaultAgencyIdFieldMappingFactory;

@CsvFields(filename = "regions.txt", required = false)
public final class Region extends IdentityBean<AgencyAndId> {

  private static final long serialVersionUID = 1L;

  @CsvField(name = "region_id", mapping = DefaultAgencyIdFieldMappingFactory.class)
  private AgencyAndId id;

  @CsvField(name = "region_name")
  private String name;

  @CsvField(name = "bounds", optional = true)
  private String bounds;

  @CsvField(name = "region_type", defaultValue = "0", optional = true, alwaysIncludeInOutput = true)
  private int type = 0;

  @Override
  public AgencyAndId getId() {
    return id;
  }

  @Override
  public void setId(AgencyAndId id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBounds() {
    return bounds;
  }

  public void setBounds(String bounds) {
    this.bounds = bounds;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "<Region " + this.id + ">";
  }
}
