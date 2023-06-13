package com.beautycommerce.middlewaresvc.Pojo.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @JsonProperty("addressId")
    private UUID addressId;
    @JsonProperty("recipientName")
    private String recipientName;
    @JsonProperty("fullAddress")
    private Text fullAddress;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postalCode")
    private int postalCode;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
