package bitcamp.project.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import bitcamp.project.mybatis.DBService;
import bitcamp.project.vo.PjCommentVO;
import bitcamp.project.vo.PjNoticeVO;

public class DAO {
	
	//게시글 전체 건수
	public static int getTotalCount() {
		SqlSession ss = DBService.getFactory().openSession();
		int totalCount = ss.selectOne("pjnotice.totalCount");
		ss.close();
		return totalCount;
	}
	
	//페이지에 해당하는 글목록 가져오기
	public static List<PjNoticeVO> getList(int begin, int end) {
		SqlSession ss = DBService.getFactory().openSession();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("begin", begin);
		map.put("end", end);
		List<PjNoticeVO> list = ss.selectList("list", map);
		ss.close();
		return list;
	}
	
	//댓글 불러오기
/*	public static List<PjCommentVO> getCommList(int pj_idx) {
		SqlSession ss = DBService.getFactory().openSession();
		List<PjCommentVO> list = ss.selectList("pjnotice.commList",pj_idx);
		ss.close();
		return list;
	}
	
	//댓글 개수
	public static int update_com_count(int pj_idx) {
		SqlSession ss = DBService.getFactory().openSession(true);
		int comcount = ss.update("pjnotice.update_com_count",pj_idx);
		ss.close();
		return comcount;
	}
*/	
	//조회수+1
	public static int getUpdateHit(int pj_idx) {
		SqlSession ss = DBService.getFactory().openSession(true);		
		int hitup = ss.update("pjnotice.hitup",pj_idx);
		ss.close();
		return hitup;
	}
	
	//검색
	public static List<PjNoticeVO> getListWithKeyword(String field, String query) {
		System.out.println("DAO : " + field);
		System.out.println("DAO : " + query);
        SqlSession ss = DBService.getFactory().openSession();
        HashMap<String, String> fieldAndKeyword = new HashMap<String, String>();
        fieldAndKeyword.put("field", field);
        fieldAndKeyword.put("query", query);

        
        List<PjNoticeVO> list = ss.selectList("pjnotice.getListWithKeyword", fieldAndKeyword);
        System.out.println("List : " + list);
        ss.close();
        
        
        return list;
    }
	
}
