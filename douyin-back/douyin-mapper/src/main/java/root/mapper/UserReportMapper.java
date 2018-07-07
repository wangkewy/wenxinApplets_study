package root.mapper;

import root.model.UserReport;

public interface UserReportMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserReport record);

    int insertSelective(UserReport record);

    UserReport selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserReport record);

    int updateByPrimaryKey(UserReport record);
}