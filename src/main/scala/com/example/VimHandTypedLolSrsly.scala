package com.example

import com.google.common.base.Strings
import io.swagger.annotations.{ApiModel, ApiModelProperty}

import scala.annotation.meta.field

@ApiModel(description = "Metrics for a specific item")
case class VimHandTypedLolSrsly(
    @(ApiModelProperty @field)(
      value = "The id being summarized",
      required = true
    )
    id: String,
    @(ApiModelProperty @field)(
      name = "sources",
      value = "The data sources these metrics haved been aggregate from",
      required = true
    )
    sources: Seq[String]
) {
    require(
      !Strings.isNullOrEmpty(id),
      "id cannot be null or empty"
    )
    require(
      sources != null && !sources.isEmpty,
      "sources cannot be null or empty"
    )
} 
