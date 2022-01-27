package com.es.daily_report.vo;

import com.es.daily_report.enums.ProductState;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {
      @Nullable
      private String number;

      private String name;

      private String model;

      @JsonProperty("in_line")
      private String inLine;

      private ProductState status;

      private String remark;

      @JsonProperty("key")
      public String getKey() {
            return number;
      }
}
