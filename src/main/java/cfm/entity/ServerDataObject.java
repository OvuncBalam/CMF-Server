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
    private long rowId;

    @Column(name = "a_Value")
    private String avalue;

    @Column(name = "address_Out")
    private int addressOut;

    @Column(name = "address_In")
    private int addressIn;

    @Column(name = "b_Value")
    private String bvalue;

    @Column(name = "bit_Position")
    private int bitPosition;

    @Column(name = "button_Path")
    private String buttonPath;

    @Column(name = "code")
    private String code;

    @Column(name = "_decimal_")
    private boolean decimal;

    @Column(name = "default_Value")
    private int defaultValue;

    @Column(name = "_delay_")
    private int delay;

    @Column(name = "_delta_")
    private int delta;

    @Column(name = "_description_")
    private String description;

    @Column(name = "_dimension_")
    private int dimension;

    @Column(name = "_frequency_")
    private int frequency;

    @Column(name = "function_Code")
    private String functionCode;

    @Column(name = "_grpCategory_")
    private int grpCategory;

    @Column(name = "id_group")
    private int idgroup;

    @Column(name = "idhs_Variable")
    private int idhsVariable;

    @Column(name = "idvar_mdl")
    private long idVarMdl;

    @Column(name = "_imageoff_")
    private String imageOff;

    @Column(name = "_imageon_")
    private int imageOn;

    @Column(name = "insert_time")
    private LocalDateTime insertTime;

    @Column(name = "is_Active")
    private boolean isActive;

    @Column(name = "is_Cancelled")
    private boolean isCancelled;

    @Column(name = "is_haccp")
    private LocalDateTime isHaccp;

    @Column(name = "is_logic")
    private boolean isLogic;

    @Column(name = "is_onchange")
    private boolean isOnChange;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @Column(name = "_length_")
    private int length;

    @Column(name = "_maximum_")
    private String maximum;

    @Column(name = "_minimum_")
    private int minimum;

    @Column(name = "_priority_")
    private int priority;

    @Column(name = "read_write")
    private int readWrite;

    @Column(name = "to_display")
    private String toDisplay;

    @Column(name = "_type_")
    private int type;

    @Column(name = "var_encoding")
    private String varEncoding;

    @Column(name = "detail_id")
    private String detailId;

    @Column(name = "device_model")
    private String deviceModel;
}
