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
public class UserAction extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 动作类型
     */
    private String action;

    /**
     * 得分
     */
    private Integer point;

    /**
     * 关联的帖子ID
     */
    private String postId;

    /**
     * 关联的评论ID
     */
    private String commentId;

    private LocalDateTime created;

    private LocalDateTime modified;


}
