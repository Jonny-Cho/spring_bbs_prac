package com.javalec.spring_pjt_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.spring_pjt_board.dao.BDao;
import com.javalec.spring_pjt_board.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		// 데이터베이스에서 dto를 받아서 view로 넘겨준다
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
		
		
		
	}

}
