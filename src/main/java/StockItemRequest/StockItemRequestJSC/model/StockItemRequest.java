package StockItemRequest.StockItemRequestJSC.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
public class StockItemRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long id;

    private String requestingDepartment;
    private Integer productCode;
    private String departmentCode;
    private String purposeOfIssue;
    private String  itemDescription;
    private Date dateOfPreviousIssue;
    private Integer  previusIssueQuanity;
    private  Integer estimatedValue;
    private  String signatureImageUrl;
    private Integer quantity;



}
