package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;

@Repository
public class BoardVOImpl implements BoardDAO{
	
	private static final String NameSpace="org.zerock.mapper.BoardMapper";
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(NameSpace+".create", vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NameSpace+".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(NameSpace+".update", vo);
		
	}

	@Override
	public void delete(Integer bno) throws Exception {
		sqlSession.delete(NameSpace+".delete", bno);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList(NameSpace+".listAll");
	}

}
