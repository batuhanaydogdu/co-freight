package com.thy.cargo.InterlineFlights.dto.or;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.escalon.hypermedia.hydra.mapping.Vocab;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonldType("cargo:TransportLegs")
@JsonldNamespace(name = "cargo", uri = "https://onerecord.iata.org/ns/cargo#")
@JsonldResource
@Getter
@Setter
@Vocab("https://onerecord.iata.org/ns/cargo#")
public class TransportLegsOR {
    @JsonProperty("cargo:transportIdentifier")
    private String transportIdentifier;

    @JsonProperty("cargo:departureLocation")
    private String departureLocation;

    @JsonProperty("cargo:arrivalLocation")
    private String arrivalLocation;

    @JsonProperty("cargo:co2Emissions")
    private String co2Emissions;





}