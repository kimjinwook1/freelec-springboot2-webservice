package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class PostsListResponseDto {

	private Long id;
	private String title;
	private String author;
	private LocalDateTime modifiedDate;

	public PostsListResponseDto(Posts entity) {
		id = entity.getId();
		title = entity.getTitle();
		author = entity.getAuthor();
		modifiedDate = entity.getModifiedDate();
	}
}
