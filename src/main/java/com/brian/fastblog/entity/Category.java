package com.brian.fastblog.entity;

import java.time.LocalDateTime;
import com.brian.fastblog.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author brian
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Category extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 标题
     */
    private String name;

    /**
     * 内容描述
     */
    private String content;

    private String summary;

    /**
     * 图标
     */
    private String icon;

    /**
     * 该分类的内容数量
     */
    private Integer postCount;

    /**
     * 排序编码
     */
    private Integer orderNum;

    /**
     * 父级分类的ID
     */
    private Long parentId;

    /**
     * SEO关键字
     */
    private String metaKeywords;

    /**
     * SEO描述内容
     */
    private String metaDescription;

    /**
     * 创建日期
     */
    private LocalDateTime created;

    private LocalDateTime modified;

    private Integer status;


}
