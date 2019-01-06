package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author liu_cc
 * @create 2019-01-06 16:42
 */
public interface CmsPageRepository extends MongoRepository<CmsPage, String> {
}
