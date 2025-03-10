package com.kh.mybatis.board.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.dao.BoardDao;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.PageInfo;
import com.kh.mybatis.common.Templete;

public class BoardServiceImpl implements BoardService{

	private BoardDao bDao = new BoardDao();
	
	@Override
	public int selectListCount() {
		SqlSession sqlSession = Templete.getSqlSession();
		int listCount = bDao.selectListCount(sqlSession);
		
		sqlSession.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Board> selectList(PageInfo pi) {
		SqlSession sqlSession = Templete.getSqlSession();
		ArrayList<Board> list = bDao.selectList(sqlSession, pi);

		sqlSession.close();
		
		return list;
	}

	@Override
	public int selectSearchCount(HashMap<String, String> map) {
		SqlSession sqlSession = Templete.getSqlSession();
		int listCount = bDao.selectSearchCount(sqlSession, map);
		
		sqlSession.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Board> selectSearchList(HashMap<String, String> map, PageInfo pi) {
		SqlSession sqlSession = Templete.getSqlSession();
		ArrayList<Board> list = bDao.selectSearchList(sqlSession, map, pi);

		sqlSession.close();
		
		return list;
	}
	
	@Override
	public ArrayList<Board> selectDetailList() {
		SqlSession sqlSession = Templete.getSqlSession();
		ArrayList<Board> list = bDao.selectSearchDetailList(sqlSession);

		sqlSession.close();
		
		return list;
	}

}