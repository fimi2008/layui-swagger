package io.github.fimi2008.controller.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 新增用户参数
 * <p>
 *
 * @author wangxiang
 * created on 2020/12/4 14:54
 */
@Data
@ApiModel(description = "新增用户参数")
public class InsertUserDTO {
    @ApiModelProperty(value = "用户ID", example = "1")
    private Long id;

    @ApiModelProperty(value = "用户名称", example = "Lionxxw")
    private String name;

    @ApiModelProperty(value = "年龄", example = "21")
    private Integer age;
}
