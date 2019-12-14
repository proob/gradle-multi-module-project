package pl.jlabs.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@Builder
@ToString
public class Product {
    private String name;
    private double price;
    private Date creationDate;
    private Date lastUpdated;
}
