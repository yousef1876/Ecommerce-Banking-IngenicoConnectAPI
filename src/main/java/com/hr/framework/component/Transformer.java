package com.hr.framework.component;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.hr.framework.constant.CommonsConstant;
import com.hr.framework.po.horlder.User;
import com.hr.framework.tools.BeanUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


@Component
public class Transformer {


  public List<Long> idsStr2List(String idsStr) {
    return Lists.newArrayList(niceCommaSplitter.split(idsStr)).stream().map(Long::valueOf)
        .collect(Collectors.toList());
  }

  public Set<String> str2Set(String str) {
    if (StringUtils.isBlank(str)) {
      return new HashSet<>();
    }
    return Sets.newHashSet(niceCommaSplitter.split(str));
  }

  public String IdList2IdsStr(List<Long> list) {
    return list.stream().map(String::valueOf).collect(Collectors.joining(CommonsConstant.COMMA));
  }


  public Page poPage2VO(List content, Pageable pageable, Long totalElements) {
    return new PageImpl<>(content, pageable, totalElements);
  }


  public <T> T param2PO(Class<T> type, Object param, T po, User currentUser) throws Exception {
    // Init createdBy, lastModifiedBy
    Long createdBy;
    Long lastModifiedBy;
    // Init transformer
    Field idField = type.getDeclaredField(CommonsConstant.ID);
    idField.setAccessible(true);
    Field createdByField = type.getDeclaredField(CommonsConstant.CREATED_BY);
    createdByField.setAccessible(true);
    Field lastModifiedByField = type.getDeclaredField(CommonsConstant.LAST_MODIFIED_BY);
    lastModifiedByField.setAccessible(true);
    if (idField.get(po) == null) {
      createdBy = currentUser.getId();
      lastModifiedBy = createdBy;
    } else {
      createdBy = (Long) createdByField.get(po);
      lastModifiedBy = currentUser.getId();
    }
    // Set param.
    BeanUtils.copyPropertiesIgnoreNull(param, po);
    createdByField.set(po, createdBy);
    lastModifiedByField.set(po, lastModifiedBy);
    return po;
  }


  public List pos2VOs(Class<?> type, List pos)
      throws InstantiationException, IllegalAccessException {
    List voList = new ArrayList();
    for (Object po : pos) {
      Object vo = po2VO(type, po);
      voList.add(vo);
    }
    return voList;
  }


  public <T> T po2VO(Class<T> clazz, Object po)
      throws InstantiationException, IllegalAccessException {
    T vo = clazz.newInstance();
    BeanUtils.copyPropertiesIgnoreNull(po, vo);
    return vo;
  }

  private final Splitter niceCommaSplitter = Splitter.on(CommonsConstant.COMMA).omitEmptyStrings()
      .trimResults();
}
