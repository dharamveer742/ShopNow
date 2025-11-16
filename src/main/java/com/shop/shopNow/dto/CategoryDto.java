package com.shop.shopNow.dto;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String  name;
    private List<ProductDto> productList;
}
