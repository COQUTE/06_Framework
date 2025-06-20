package edu.kh.project.admin.model.mapper;

import edu.kh.project.board.model.dto.Board;
import edu.kh.project.member.model.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    Member login(String memberEmail);

    List<Member> weekEnrollMember();

    Board maxReadCount();

    Board maxLikeCount();

    Board maxCommentCount();

    List<Member> selectWithdrawnMemberList();

    List<Board> selectDeleteBoardList();
    
    int restoreMember(int memberNo);

    int restoreBoard(int boardNo);
    
    int checkEmail(String memberEmail);
    
    int createAdminAccount(Member member);
    
    List<Member> selectAdminMemberList();
}
