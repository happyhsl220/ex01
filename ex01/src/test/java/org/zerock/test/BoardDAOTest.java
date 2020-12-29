package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	@Inject
	BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
//	@Test
//	public void testCreat() throws Exception{
//		BoardVO vo = new BoardVO();
//		vo.setContent("content");
//		vo.setTitle("title");
//		vo.setWriter("writer");
//		
//		dao.create(vo);
//	}
	

	
//	@Test
//	public void testUpdate() throws Exception{
//		BoardVO vo = new BoardVO();
//		vo.setContent("수정된 내용");
//		vo.setTitle("수정된제목");
//		vo.setWriter("수정된작가");
//		vo.setBno(5020);
//		dao.update(vo);
//	}
	
	@Test
	public void testRead() throws Exception{
		BoardVO vo = dao.read(5020);
		System.out.println(vo.toString());
	}
//	
//	@Test
//	public void testDelete() throws Exception{
//		dao.delete(5020);
//	}
	
	@Test
	public void testListAll() throws Exception{
		
	}
}
