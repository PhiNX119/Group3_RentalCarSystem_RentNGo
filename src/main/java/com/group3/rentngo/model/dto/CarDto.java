package com.group3.rentngo.model.dto;

import com.group3.rentngo.model.entity.*;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO for {@link Car}
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarDto implements Serializable {

    private Long id;

    @NotBlank(message = "Mandatory information.")
    String name;

    @NotBlank(message = "Mandatory information.")
    String licensePlate;

    @NotBlank(message = "Mandatory information.")
    String brand;

    @NotBlank(message = "Mandatory information.")
    String model;

    @NotBlank(message = "Mandatory information.")
    String color;

    @Positive(message = "Must be positive number.")
    int numberOfSeats;

    @Positive(message = "Must be positive number.")
    int productionYear;

    @NotBlank(message = "Mandatory information.")
    String transmissionType;

    @NotBlank(message = "Mandatory information.")
    String fuelType;

    @Positive(message = "Must be positive number.")
    long mileage;

    @NotBlank(message = "Mandatory information.")
    String fuelConsumption;

    @Positive(message = "Must be positive number.")
    double basePrice;

    @Positive(message = "Must be positive number.")
    double deposit;

    @NotBlank(message = "Mandatory information.")
    String address;

    @NotBlank(message = "Mandatory information.")
    String description;

    @NotBlank(message = "Mandatory information.")
    String additionalFunctions;

    @NotBlank(message = "Mandatory information.")
    String termOfUse;

    @NotNull(message = "Mandatory information.")
    MultipartFile registrationPaper;
    String registrationPaperPath;

    @NotNull(message = "Mandatory information.")
    MultipartFile certificateOfInspection;
    String certificateOfInspectionPath;

    @NotNull(message = "Mandatory information.")
    MultipartFile insurance;
    String insurancePath;

    @NotNull(message = "Mandatory information.")
    MultipartFile frontImage;
    public String frontImagePath;

    @NotNull(message = "Mandatory information.")
    MultipartFile backImage;
    public String backImagePath;

    @NotNull(message = "Mandatory information.")
    MultipartFile leftImage;
    public String leftImagePath;

    @NotNull(message = "Mandatory information.")
    MultipartFile rightImage;
    public String rightImagePath;

    @NotNull(message = "Mandatory information.")
    CarOwner carOwner;



}