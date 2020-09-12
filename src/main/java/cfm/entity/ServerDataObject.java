package cfm.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "objects")
public class ServerDataObject {

    @Id
    @Column(length = 100, nullable = false)
    private String objectId;

    @Column(name = "rowId")
    private String rowId;

    @Column(name = "a_Value")
    private String avalue;

    @Column(name = "address_Out")
    private String addressOut;

    @Column(name = "address_In")
    private String addressIn;

    @Column(name = "b_Value")
    private String bvalue;

    @Column(name = "bit_Position")
    private String bitPosition;

    @Column(name = "button_Path")
    private String buttonPath;

    @Column(name = "code")
    private String code;

    @Column(name = "_decimal_")
    private String decimal;

    @Column(name = "default_Value")
    private String defaultValue;

    @Column(name = "_delay_")
    private String delay;

    @Column(name = "_delta_")
    private String delta;

    @Column(name = "_description_")
    private String description;

    @Column(name = "_dimension_")
    private String dimension;

    @Column(name = "_frequency_")
    private String frequency;

    @Column(name = "function_Code")
    private String functionCode;

    @Column(name = "_grpCategory_")
    private String grpCategory;

    @Column(name = "id_group")
    private String idgroup;

    @Column(name = "idhs_Variable")
    private String idhsVariable;

    @Column(name = "idvar_mdl")
    private String idVarMdl;

    @Column(name = "_imageoff_")
    private String imageOff;

    @Column(name = "_imageon_")
    private String imageOn;

    @Column(name = "insert_time")
    private String insertTime;

    @Column(name = "is_Active")
    private String isActive;

    @Column(name = "is_Cancelled")
    private String isCancelled;

    @Column(name = "is_haccp")
    private String isHaccp;

    @Column(name = "is_logic")
    private String isLogic;

    @Column(name = "is_onchange")
    private String isOnChange;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "_length_")
    private String length;

    @Column(name = "_maximum_")
    private String maximum;

    @Column(name = "_minimum_")
    private String minimum;

    @Column(name = "_priority_")
    private String priority;

    @Column(name = "read_write")
    private String readWrite;

    @Column(name = "to_display")
    private String toDisplay;

    @Column(name = "_type_")
    private String type;

    @Column(name = "var_encoding")
    private String varEncoding;

    @Column(name = "detail_id")
    private String detailId;

    @Column(name = "device_model")
    private String deviceModel;
}
