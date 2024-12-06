package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.dto.CommentDTO;
import com.company.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
	private final CommentRepository commentRepository;

	public void save(CommentDTO commentDTO) {
		commentRepository.save(commentDTO);
	}

	public List<CommentDTO> findAll(Long boardId) {
		return commentRepository.findAll(boardId);
	}
}
