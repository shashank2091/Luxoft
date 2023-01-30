package com.example.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.helper.CSVHelper;
import com.example.helper.Info;
import com.example.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	InfoRepository repository;

	public void save(MultipartFile file) {
		try {
			List<Info> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
			repository.saveAll(tutorials);
		} catch (IOException e) {
			throw new RuntimeException("fail to store csv data: " + e.getMessage());
		}
	}

	public List<Info> getAllTutorials() {
		return repository.findAll();
	}
}

