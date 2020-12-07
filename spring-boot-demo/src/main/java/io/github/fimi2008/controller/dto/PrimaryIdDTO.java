package io.github.fimi2008.controller.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 主键删除参数
 * <p>
 *
 * @author wangxiang
 * created on 2020/12/4 17:48
 */
@Data
@ApiModel(description = "主键删除参数")
public class PrimaryIdDTO<T> {

    @ApiModelProperty(value = "主键ID", example = "1")
    private T id;
}
