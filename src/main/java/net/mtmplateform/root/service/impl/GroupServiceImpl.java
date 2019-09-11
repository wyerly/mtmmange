package net.mtmplateform.root.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.mtmplateform.root.mapper.GroupMapper;
import net.mtmplateform.root.po.GroupPo;
import net.mtmplateform.root.service.GroupService;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupPo> implements GroupService {

}
