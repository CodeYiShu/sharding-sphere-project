package com.codeshu.controller;

import com.codeshu.entity.Dict;
import com.codeshu.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CodeShu
 * @date 2023/9/2 15:30
 */
@RestController
@RequestMapping("dict")
public class DictController {
	@Autowired
	private DictMapper dictMapper;

	@GetMapping("getAll")
	public List<Dict> getAll() {
		return dictMapper.selectList(null);
	}

	@PostMapping("insert")
	public String insert(@RequestBody Dict dict) {
		dictMapper.insert(dict);
		return "插入成功";
	}
}
