package io.github.fimi2008.controller;

import io.github.fimi2008.controller.dto.InsertUserDTO;
import io.github.fimi2008.controller.dto.UserInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户管理
 * <p>
 *
 * @author wangxiang
 * created on 2020/12/4 14:54
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理", value = "用户管理")
public class UserController {

    private static List<UserInfoDTO> USER_LIST = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++) {
            UserInfoDTO user = new UserInfoDTO();
            user.setCreateTime(new Date());
            user.setLastUpdateTime(new Date());
            user.setId((long) i);
            user.setName("测试" + i);
            user.setAge(20 + i);
            USER_LIST.add(user);
        }
    }

    @ApiOperation(notes = "新增用户", value = "新增用户")
    @PostMapping
    public ResponseEntity<String> insert(@RequestBody InsertUserDTO dto) {
        UserInfoDTO user = new UserInfoDTO();
        BeanUtils.copyProperties(dto, user);
        if (USER_LIST.contains(user)) {
            throw new RuntimeException("用户ID重复");
        }
        user.setCreateTime(new Date());
        USER_LIST.add(user);
        return ResponseEntity.ok("新增成功");
    }

    @ApiOperation(notes = "修改用户", value = "修改用户")
    @PutMapping
    public ResponseEntity<String> update(@RequestBody InsertUserDTO dto) {
        UserInfoDTO user = new UserInfoDTO();
        BeanUtils.copyProperties(dto, user);
        if (!USER_LIST.contains(user)) {
            throw new RuntimeException("用户不存在");
        }
        int index = 0;
        for (int i = 0; i < USER_LIST.size(); i++) {
            if (USER_LIST.get(i).equals(user.getId())) {
                index = i;
                break;
            }
        }
        user.setLastUpdateTime(new Date());
        USER_LIST.set(index, user);
        return ResponseEntity.ok("更新成功");
    }

    @ApiOperation(notes = "删除用户", value = "删除用户")
    @DeleteMapping
    public ResponseEntity<String> del(Long id) {
        UserInfoDTO user = new UserInfoDTO();
        user.setId(id);
        if (!USER_LIST.contains(user)) {
            throw new RuntimeException("用户不存在");
        }
        USER_LIST.remove(user);
        return ResponseEntity.ok("删除成功");
    }

    @ApiOperation(notes = "查询所有用户", value = "查询所有用户")
    @GetMapping
    public ResponseEntity<List<UserInfoDTO>> list() {
        return ResponseEntity.ok(USER_LIST);
    }
}
