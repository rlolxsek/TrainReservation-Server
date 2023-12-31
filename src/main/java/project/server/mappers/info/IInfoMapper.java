package project.server.mappers.info;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import project.server.entities.info.AnswerEntity;
import project.server.entities.info.BoardEntity;
import project.server.entities.info.EnquiryEntity;
import project.server.vos.info.AnswerVo;
import project.server.vos.info.EnquiryVo;
import project.server.vos.member.MemberVo;

import java.util.List;
import java.util.Optional;

@Mapper
public interface IInfoMapper {

    @Select("select `index`,`title`,`create_date` from `info`.`board`")
    List<BoardEntity> selectAll();

    @Select("select * from `info`.`board` where `title` like '%${search}%' or `content` like '%${search}%'")
    List<BoardEntity> selectBySearch(String search);

    @Select("select * from `info`.`board` where `index` = ${index}")
    List<BoardEntity> selectByIndex(int index);



    List<EnquiryVo> selectEnquiry(MemberVo member);
    List<EnquiryVo> selectEnquiryBySearch (EnquiryVo search);
    List<EnquiryVo> selectEnquiryByIndex(int index);
    List<AnswerVo> selectAnswerByIndex (int index);

    int insertEnquiry(EnquiryEntity input);
    int insertAnswer(AnswerEntity input);
    int updateAnswer(AnswerEntity input);
    int deleteAnswer(AnswerEntity input);


    Optional<AnswerEntity> isAnswered(int index);


}
