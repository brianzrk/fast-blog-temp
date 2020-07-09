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
public class UserCollection extends BaseEntity {

    private static final long serialVersionUID=1L;

    private Long userId;

    private Long postId;

    private Long postUserId;

    private LocalDateTime created;

    private LocalDateTime modified;


}
