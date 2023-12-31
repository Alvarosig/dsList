package com.devsuperior.dslist.entities.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {
	
	private Long id;
	private String title;
	private Double score;
	private Integer year;
	private String genre;
	private String platforms;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
}
